package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.model.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
@Slf4j
public class TuClinicaController {

    @Autowired
    private PaisService pais;
    @Autowired
    private DepartamentoService departamento;
    @Autowired
    private MunicipioService municipio;
    @Autowired
    private DireccionService direccion;
    @Autowired
    private UsuarioService usuario;
    @Autowired
    private MascotaService mascota;
    @Autowired
    private EspecieService especie;
    @Autowired
    private RazaService raza;
    @Autowired
    private HistoriaService historia;
    @Autowired
    private Historia_SuministroService historia_suministro;
    @Autowired
    private SuministroService suministro;
    @Autowired
    private Tipo_IdentificacionService tipo_identificacion;
    @Autowired
    private Tipo_SuministroService tipo_suministro;
    @Autowired
    private Tipo_UsuarioService tipo_usuario;
    @Autowired
    private Tipo_ServicioService tipo_servicio;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/application/signup")
    public String userSignup(Model model, UsuarioDTO usuario, DireccionDTO direccion, MascotaDTO mascota) {
        var tipo_identificacion = this.tipo_identificacion.listAll();
        model.addAttribute("identificaciones", tipo_identificacion);
        var pais = this.pais.listAll();
        model.addAttribute("paises", pais);
        var departamentos = this.departamento.listAll();
        model.addAttribute("departamentos", departamentos);
        var municipios = this.municipio.listAll();
        model.addAttribute("municipios", municipios);
        model.addAttribute("direccion", direccion);
        model.addAttribute("usuario", usuario);
        var especies = this.especie.listAll();
        model.addAttribute("especies", especies);
        var razas = this.raza.listAll();
        model.addAttribute("razas", razas);
        model.addAttribute("mascota", mascota);
        return "application/signup";
    }

    @GetMapping("/application/forgot")
    public String userForgotPwd(Model model) {
        return "application/forgot";
    }

    @GetMapping("/application/dashboard")
    public String userDashboard(Model model) {
        return "application/dashboard";
    }

    @GetMapping("/admin/login")
    public String adminLogin(Model model) {
        return "admin/login";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard(Model model) {
        return "admin/dashboard";
    }

    @PostMapping("/addUserByForm")
    public String signupUser(UsuarioDTO usuario, DireccionDTO direccion, MascotaDTO mascota) {
        var ids = this.tipo_usuario.listAll();
        usuario.setRol(ids.get(1));
        usuario.setEstado(true);
        direccion.setUsuario(usuario);
        mascota.setDueno(usuario);
        this.usuario.save(usuario);
        this.direccion.save(direccion);
        this.mascota.save(mascota);
        return "redirect:/application/dashboard";
    }

    @PostMapping("/authenticateApplication")
    public String login() {
        return "redirect:/application/dashboard";
    }
    @PostMapping("/authenticateAdmin")
    public String loginAdmin() {
        return "redirect:/admin/dashboard";
    }
}

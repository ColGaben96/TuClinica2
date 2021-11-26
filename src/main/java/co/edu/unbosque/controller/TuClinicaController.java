package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.DireccionDTO;
import co.edu.unbosque.model.persistence.UsuarioDTO;
import co.edu.unbosque.model.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/application/login")
    public String userlogin(UsuarioDTO usuario, Model model) {
        model.addAttribute("usuario", usuario);
        return "application/login";
    }

    @GetMapping("/application/signup")
    public String userSignup(Model model, UsuarioDTO usuario, DireccionDTO direccion) {
        var tipo_identificacion = this.tipo_identificacion.listAll();
        model.addAttribute("usuario", usuario);
        model.addAttribute("identificaciones", tipo_identificacion);
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
    public String signupUser(UsuarioDTO usuario) {
        var ids = this.tipo_usuario.listAll();
        usuario.setRol(ids.get(1));
        this.usuario.save(usuario);
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

package uz.doston.springcrm.controller;


import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import uz.doston.springcrm.dto.organization.OrganizationCreateDto;
import uz.doston.springcrm.dto.organization.OrganizationUpdateDto;
import uz.doston.springcrm.service.organization.OrganizationService;
import uz.doston.springcrm.service.project.ProjectService;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/organization/*")
public class OrganizationController extends AbstractController<OrganizationService> {

    private final ProjectService projectService;

    public OrganizationController(OrganizationService service, ProjectService projectService) {
        super(service);
        this.projectService = projectService;
    }

    @GetMapping("")
    public String getAll(Model model) {
        model.addAttribute("organizations", service.getAll());
        return "organization/list";
    }

    @GetMapping("create")
    public String createPage(Model model) {
        model.addAttribute("dto", new OrganizationCreateDto());
        return "organization/create";
    }

    @SneakyThrows
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute(name = "dto") OrganizationCreateDto dto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "organization/create";
        }
        service.create(dto);
        return "redirect:/organization/list";
    }

    @RequestMapping(value = "update/{code}", method = RequestMethod.GET)
    public String updatePage(Model model, @PathVariable String code) {

        model.addAttribute("organization", service.get(code));

        return "organization/update";
    }

    @SneakyThrows
    @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
    public String update(@Valid @ModelAttribute OrganizationUpdateDto dto, BindingResult bindingResult, @PathVariable Long id) {
        if (bindingResult.hasErrors()) {
            return "organization/update";
        }
        dto.setId(id);
        service.update(dto);
        return "redirect:/organization/list";


    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.POST)
    public String delete(@PathVariable String code) {
        service.delete(code);
        return "redirect:/organization/list";
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    String detailsPage(Model model, @PathVariable String code) {
        model.addAttribute("projects", projectService.getAll());
        return "project/list";
    }
}

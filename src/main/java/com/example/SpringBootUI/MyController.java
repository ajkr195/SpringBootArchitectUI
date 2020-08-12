package com.example.SpringBootUI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String indexPage(Model model) {
		return "index";
	}
	
	@GetMapping("/index.html")
	public String indexmPage(Model model) {
		return "index";
	}

	@GetMapping("/charts-chartjs.html")
	public String chartsPage(Model model) {
		return "charts-chartjs";
	}

	@GetMapping("/components-accordions.html")
	public String componentsPage(Model model) {
		return "components-accordions";
	}
	
	@GetMapping("/components-calendar.html")
	public String componentscalPage(Model model) {
		return "components-calendar";
		
		
	}
	@GetMapping("/components-carousel.html")
	public String componentscarPage(Model model) {
		return "components-carousel";
	}
	@GetMapping("/components-maps.html")
	public String componentsmapPage(Model model) {
		return "components-maps";
	}
	@GetMapping("/components-modals.html")
	public String componentsmodalPage(Model model) {
		return "components-modals";
	}
	@GetMapping("/components-notifications.html")
	public String componentsnotPage(Model model) {
		return "components-notifications";
	}
	@GetMapping("/components-pagination.html")
	public String componentsPagination(Model model) {
		return "components-accordions";
	}
	@GetMapping("/components-progress-bar.html")
	public String componentsprogrsPage(Model model) {
		return "components-progress-bar";
	}
	@GetMapping("/components-scrollable-elements.html")
	public String componentsscrollPage(Model model) {
		return "components-scrollable-elements";
	}
	@GetMapping("/components-tabs.html")
	public String componentstabsPage(Model model) {
		return "components-tabs";
	}
	@GetMapping("/components-tooltips-popovers.html")
	public String componentssdftabsPage(Model model) {
		return "components-tooltips-popovers";
	}
	@GetMapping("/dashboard-boxes.html")
	public String dashtabsPage(Model model) {
		return "dashboard-boxes";
	}
	@GetMapping("/elements-badges-labels.html")
	public String elecomponentstabsPage(Model model) {
		return "elements-badges-labels";
	}
	@GetMapping("/elements-buttons-standard.html")
	public String elbcomponentstabsPage(Model model) {
		return "elements-buttons-standard";
	}
	@GetMapping("/elements-cards.html")
	public String elccomponentstabsPage(Model model) {
		return "elements-cards";
	}
	@GetMapping("/elements-dropdowns.html")
	public String eldfccomponentstabsPage(Model model) {
		return "elements-dropdowns";
	}
	@GetMapping("/elements-icons.html")
	public String elccomdsponentstabsPage(Model model) {
		return "elements-icons";
	}
	@GetMapping("/elements-list-group.html")
	public String elccomposdfnentstabsPage(Model model) {
		return "elements-list-group";
	}
	@GetMapping("/elements-navigation.html")
	public String elccomponedfntstabsPage(Model model) {
		return "elements-navigation";
	}
	@GetMapping("/elements-utilities.html")
	public String elccomponutilentstabsPage(Model model) {
		return "elements-utilities";
	}
	@GetMapping("/forms-controls.html")
	public String elccosdfmponutilentstabsPage(Model model) {
		return "forms-controls";
	}
	@GetMapping("/forms-layouts.html")
	public String flelccomponutilentstabsPage(Model model) {
		return "forms-layouts";
	}
	@GetMapping("/forms-validation.html")
	public String fvelccomponutilentstabsPage(Model model) {
		return "forms-validation";
	}
	@GetMapping("/tables-regular.html")
	public String trelccomponutilentstabsPage(Model model) {
		return "tables-regular";
	}
	
	

}

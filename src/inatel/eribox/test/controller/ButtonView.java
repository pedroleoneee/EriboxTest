package inatel.eribox.test.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@ManagedBean
@RequestScoped
public class ButtonView {
	private MenuModel model;
	 
    @PostConstruct
    public void init() {
        model = new DefaultMenuModel();
 
//        //First submenu
//        DefaultMenuItem item = DefaultMenuItem.builder()
//                .value("External")
//                .url("http://www.primefaces.org")
//                .icon("pi pi-home")
//                .build();
// 
// 
//        DefaultSubMenu firstSubmenu = DefaultSubMenu.builder()
//                .label("Dynamic Submenu")
//                .addElement(item)
//                .build();
// 
//        model.getElements().add(firstSubmenu);
// 
//        //Second submenu
//        item = DefaultMenuItem.builder()
//                .value("Save")
//                .icon("pi pi-save")
//                .function((i) -> save())
//                .update("messages")
//                .build();
// 
//        DefaultSubMenu secondSubmenu = DefaultSubMenu.builder()
//                .label("Dynamic Actions")
//                .addElement(item)
//                .build();
// 
//        item = DefaultMenuItem.builder()
//                .value("Delete")
//                .icon("pi pi-times")
//                .command("#{buttonView.delete}")
//                .ajax(false)
//                .build();
//        secondSubmenu.getElements().add(item);
// 
//        model.getElements().add(secondSubmenu);
    }
 
    public MenuModel getModel() {
        return model;
    }
 
    public String save() {
        addMessage("Data saved");
        return null;
    }
 
    public void update() {
        addMessage("Data updated");
    }
 
    public void delete() {
        addMessage("Data deleted");
    }
 
    public void buttonAction() {
    	System.out.println("Foi");
    }
 
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}

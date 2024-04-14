package com.example.application.views.loginh;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Login(H)")
@Route(value = "my-view2", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class LoginHView extends Composite<VerticalLayout> {

    public LoginHView() {
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        H3 h3 = new H3();
        EmailField emailField = new EmailField();
        PasswordField passwordField = new PasswordField();
        Button buttonPrimary = new Button();
        Anchor link = new Anchor();
        VerticalLayout layoutColumn5 = new VerticalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("min-content");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutColumn4.getStyle().set("flex-grow", "1");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        h3.setText("LOG IN");
        h3.setWidth("max-content");
        emailField.setLabel("Email");
        emailField.setWidth("250px");
        passwordField.setLabel("Password");
        passwordField.setWidth("250px");
        buttonPrimary.setText("Log In");
        buttonPrimary.setWidth("200px");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        link.setText("Passwort vergessen");
        link.setHref("#");
        link.setWidth("150px");
        layoutColumn5.getStyle().set("flex-grow", "1");
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        getContent().add(layoutRow2);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn4);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(layoutColumn3);
        layoutColumn3.add(h3);
        layoutColumn3.add(emailField);
        layoutColumn3.add(passwordField);
        layoutColumn3.add(buttonPrimary);
        layoutColumn3.add(link);
        layoutRow.add(layoutColumn5);
        getContent().add(layoutRow3);
    }
}

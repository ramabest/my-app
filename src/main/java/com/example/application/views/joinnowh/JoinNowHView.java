package com.example.application.views.joinnowh;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Join Now (H)")
@Route(value = "my-view3", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class JoinNowHView extends Composite<VerticalLayout> {

    public JoinNowHView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H4 h4 = new H4();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        DatePicker datePicker = new DatePicker();
        EmailField emailField = new EmailField();
        PasswordField passwordField = new PasswordField();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        Select select = new Select();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        Button buttonPrimary = new Button();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        h4.setText("JOIN NOW TO AL HAYAT");
        h4.setWidth("max-content");
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutColumn2.getStyle().set("flex-grow", "1");
        textField.setLabel("Vorname");
        textField.setWidth("min-content");
        textField2.setLabel("Nachname");
        textField2.setWidth("min-content");
        datePicker.setLabel("Geburtsdatum");
        datePicker.setWidth("min-content");
        emailField.setLabel("Email");
        emailField.setWidth("min-content");
        passwordField.setLabel("Passwort");
        passwordField.setWidth("min-content");
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        textField3.setLabel("Straße und Hausnummer");
        textField3.setWidth("min-content");
        textField4.setLabel("Stadt");
        textField4.setWidth("min-content");
        textField5.setLabel("PLZ");
        textField5.setWidth("min-content");
        textField6.setLabel("Land");
        textField6.setWidth("min-content");
        select.setLabel("Bezahlung Optionen");
        select.setWidth("min-content");
        setSelectSampleData(select);
        layoutColumn4.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("JOIN");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("150px");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        getContent().add(layoutRow);
        layoutRow.add(h4);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(textField);
        layoutColumn2.add(textField2);
        layoutColumn2.add(datePicker);
        layoutColumn2.add(emailField);
        layoutColumn2.add(passwordField);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(textField3);
        layoutColumn3.add(textField4);
        layoutColumn3.add(textField5);
        layoutColumn3.add(textField6);
        layoutColumn3.add(select);
        layoutRow2.add(layoutColumn4);
        getContent().add(buttonPrimary);
        getContent().add(layoutRow3);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setSelectSampleData(Select select) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        select.setItems(sampleItems);
        select.setItemLabelGenerator(item -> ((SampleItem) item).label());
        select.setItemEnabledProvider(item -> !Boolean.TRUE.equals(((SampleItem) item).disabled()));
    }
}

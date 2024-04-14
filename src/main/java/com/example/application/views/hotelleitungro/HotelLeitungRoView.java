package com.example.application.views.hotelleitungro;

import com.example.application.components.avataritem.AvatarItem;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("HotelLeitung (Ro)")
@Route(value = "my-view9", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class HotelLeitungRoView extends Composite<VerticalLayout> {

    public HotelLeitungRoView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        AvatarItem avatarItem = new AvatarItem();
        Button buttonSecondary = new Button();
        Button buttonSecondary2 = new Button();
        Button buttonSecondary3 = new Button();
        Button buttonSecondary4 = new Button();
        Button buttonSecondary5 = new Button();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        Button buttonSecondary6 = new Button();
        Button buttonSecondary7 = new Button();
        Button buttonSecondary8 = new Button();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        VerticalLayout layoutColumn5 = new VerticalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn3.setHeight("100%");
        avatarItem.setWidth("min-content");
        setAvatarItemSampleData(avatarItem);
        buttonSecondary.setText("Dashboard");
        layoutColumn3.setAlignSelf(FlexComponent.Alignment.START, buttonSecondary);
        buttonSecondary.setWidth("100%");
        buttonSecondary.setMinWidth("150px");
        buttonSecondary2.setText("Zimmerbelegungsplan");
        buttonSecondary2.setWidth("195px");
        buttonSecondary2.setMinWidth("150px");
        buttonSecondary3.setText("Zimmer Details");
        buttonSecondary3.setWidth("195px");
        buttonSecondary3.setMinWidth("150px");
        buttonSecondary4.setText("Angefragte Buchungen");
        buttonSecondary4.setWidth("100%");
        buttonSecondary4.setMinWidth("150px");
        buttonSecondary5.setText("Lost & Found");
        buttonSecondary5.setWidth("100%");
        buttonSecondary5.setMinWidth("150px");
        layoutRow2.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("40px");
        layoutRow2.setAlignItems(Alignment.CENTER);
        layoutRow2.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonSecondary6.setText("Check-In");
        buttonSecondary6.getStyle().set("flex-grow", "1");
        buttonSecondary7.setText("Check-Out");
        buttonSecondary7.getStyle().set("flex-grow", "1");
        buttonSecondary8.setText("Housekeeping");
        buttonSecondary8.setWidth("100%");
        buttonSecondary8.setMinWidth("150px");
        layoutColumn4.setWidth("100%");
        layoutColumn4.getStyle().set("flex-grow", "1");
        layoutColumn5.getStyle().set("flex-grow", "1");
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(layoutColumn3);
        layoutColumn3.add(avatarItem);
        layoutColumn3.add(buttonSecondary);
        layoutColumn3.add(buttonSecondary2);
        layoutColumn3.add(buttonSecondary3);
        layoutColumn3.add(buttonSecondary4);
        layoutColumn3.add(buttonSecondary5);
        layoutColumn3.add(layoutRow2);
        layoutRow2.add(buttonSecondary6);
        layoutRow2.add(buttonSecondary7);
        layoutColumn3.add(buttonSecondary8);
        layoutRow.add(layoutColumn4);
        layoutRow.add(layoutColumn5);
        getContent().add(layoutRow3);
    }

    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading("Aria Bailey");
        avatarItem.setDescription("Endocrinologist");
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
    }
}

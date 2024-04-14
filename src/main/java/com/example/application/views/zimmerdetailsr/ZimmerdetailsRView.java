package com.example.application.views.zimmerdetailsr;

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
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;

@PageTitle("Zimmerdetails(R)")
@Route(value = "my-view7", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class ZimmerdetailsRView extends Composite<VerticalLayout> {

    public ZimmerdetailsRView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        AvatarItem avatarItem = new AvatarItem();
        Button buttonSecondary = new Button();
        Button buttonSecondary2 = new Button();
        Button buttonSecondary3 = new Button();
        Button buttonSecondary4 = new Button();
        Button buttonSecondary5 = new Button();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonSecondary6 = new Button();
        Button buttonSecondary7 = new Button();
        Button buttonSecondary8 = new Button();
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutColumn2.setHeight("100%");
        avatarItem.setWidth("min-content");
        setAvatarItemSampleData(avatarItem);
        buttonSecondary.setText("Dashboard");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.START, buttonSecondary);
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
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("40px");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonSecondary6.setText("Check-In");
        buttonSecondary6.getStyle().set("flex-grow", "1");
        buttonSecondary7.setText("Check-Out");
        buttonSecondary7.getStyle().set("flex-grow", "1");
        buttonSecondary8.setText("Housekeeping");
        buttonSecondary8.setWidth("100%");
        buttonSecondary8.setMinWidth("150px");
        getContent().add(layoutColumn2);
        layoutColumn2.add(avatarItem);
        layoutColumn2.add(buttonSecondary);
        layoutColumn2.add(buttonSecondary2);
        layoutColumn2.add(buttonSecondary3);
        layoutColumn2.add(buttonSecondary4);
        layoutColumn2.add(buttonSecondary5);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonSecondary6);
        layoutRow.add(buttonSecondary7);
        layoutColumn2.add(buttonSecondary8);
    }

    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading("Aria Bailey");
        avatarItem.setDescription("Endocrinologist");
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
    }
}

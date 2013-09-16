package at.apa.ots.manager.frontend.client.local;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ioc.client.api.EntryPoint;

import com.google.gwt.user.client.ui.RootPanel;
import org.jboss.errai.ui.nav.client.local.Navigation;

/**
 * Main application entry point.
 */
@EntryPoint
public class App {

    @Inject
    private Navigation navigation;

    @PostConstruct
    public void buildUI() {
        RootPanel.get().add(navigation.getContentPanel());
        System.out.println("UI Constructed!");
    }

}
package at.apa.ots.manager.frontend.client.local.page.menu;

import at.apa.ots.manager.frontend.client.local.page.chat.Chat;
import at.apa.ots.manager.frontend.client.local.page.textarea.TextArea;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.Button;

import javax.inject.Inject;

@Templated
public class Menu extends Composite {
    @Inject
    TransitionTo<Chat> chatTransitionTo;

    @Inject
    TransitionTo<TextArea> textAreaTransitionTo;

    @Inject
    @DataField
    private Button chat;

    @Inject
    @DataField
    private Button textArea;

    @EventHandler("chat")
    public void chatButtonClick(ClickEvent e) {
        chatTransitionTo.go();
    }

    @EventHandler("textArea")
    public void textAreaButtonClick(ClickEvent e) {
        textAreaTransitionTo.go();
    }

}

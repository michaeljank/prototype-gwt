package at.apa.ots.manager.frontend.client.local.page.chat;

import at.apa.ots.manager.frontend.client.shared.HelloMessage;
import at.apa.ots.manager.frontend.client.shared.Response;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.*;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;


@Templated
@Page(startingPage = true)
public class Chat extends Composite {
    @Inject
    @DataField
    private TextBox chatText;

    @Inject
    @DataField
    private Button sendChat;

    @Inject
    @DataField
    private Label response;

    @Inject
    private Event<HelloMessage> messageEvent;

    @EventHandler("sendChat")
    public void historyButtonClick(ClickEvent e) {
        String text = chatText.getText();
        HelloMessage event = new HelloMessage(text);
        messageEvent.fire(event);
    }

    public void response(@Observes Response event) {
        System.out.println("Got a Response!");
        response.setText("HelloMessage from Server: " + event.getMessage().toUpperCase());
    }

}

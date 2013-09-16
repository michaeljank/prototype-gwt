package at.apa.ots.manager.frontend.client.local.page.textarea;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.user.client.ui.Label;
import org.jboss.errai.ui.shared.api.annotations.*;
import org.jboss.errai.ui.nav.client.local.Page;
import com.google.gwt.user.client.ui.Composite;

import javax.inject.Inject;

@Templated
@Page
public class TextArea extends Composite {
    @Inject
    @DataField
    private com.google.gwt.user.client.ui.TextArea myTextArea;

    @Inject
    @DataField
    private Label rows;

    @Inject
    @DataField
    private Label cols;

    @Inject
    @DataField
    private Label characters;

    @EventHandler("myTextArea")
    public void historyButtonClick(KeyUpEvent e) {
        int col = myTextArea.getCharacterWidth() + 2;

        String text = myTextArea.getText();
        int length = text.length();

        myTextArea.setVisibleLines(length/col + 1);

        rows.setText(String.valueOf(myTextArea.getVisibleLines()));
        cols.setText(String.valueOf(col));
        characters.setText(String.valueOf(length));
    }

}

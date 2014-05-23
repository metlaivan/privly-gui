package ua.cn.privly_gui.socialnetworks;

import java.util.ArrayList;

import ua.cn.privly_gui.R;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.widget.Toast;

public class SListUserMessagesActivity extends ActionBarActivity {
	private ArrayList<SMessage> mListUserMess;
	private ListUserMessagesAdapter mListUserMessagesAdapter;
	private ListView mListViewUserMessages;

	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		setContentView(R.layout.activity_socialnetwork_list);
		this.mListViewUserMessages = ((ListView) findViewById(R.id.lvUsersAndMessages));
		try {
			this.mListUserMess = ((ArrayList) getIntent().getExtras()
					.getSerializable("UserMessages"));
			if (this.mListUserMess != null) {
				this.mListUserMessagesAdapter = new ListUserMessagesAdapter(
						this, this.mListUserMess);
				this.mListViewUserMessages
						.setAdapter(this.mListUserMessagesAdapter);
			}
		} catch (NullPointerException localNullPointerException) {
			Toast.makeText(getApplicationContext(), "NullPointerException", 0);
		}
	}
}
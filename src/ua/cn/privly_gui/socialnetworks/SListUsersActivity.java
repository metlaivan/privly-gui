package ua.cn.privly_gui.socialnetworks;

import java.util.ArrayList;

import ua.cn.privly_gui.MainActivity;
import ua.cn.privly_gui.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class SListUsersActivity extends ActionBarActivity {
	private ArrayList<SUser> mListUserMess;
	private ListUsersAdapter mListUserMessagesAdapter;
	private ListView mListViewUsers;

	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		setContentView(R.layout.activity_socialnetwork_list);
		this.mListViewUsers = ((ListView) findViewById(R.id.lvUsersAndMessages));
		try {
			this.mListUserMess = ((ArrayList) getIntent().getExtras()
					.getSerializable("UserInfo"));
			if (this.mListUserMess != null) {
				this.mListUserMessagesAdapter = new ListUsersAdapter(this,
						this.mListUserMess);
				this.mListViewUsers.setAdapter(this.mListUserMessagesAdapter);
			}
		} catch (NullPointerException localNullPointerException) {
			Toast.makeText(getApplicationContext(), "NullPointerException", 0);
		}
		mListViewUsers.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent localIntent = new Intent(getApplicationContext(),
						SListUserMessagesActivity.class);
				localIntent.putExtra("UserMessages", mListUserMess.get(position).getListUserMess());
				startActivity(localIntent);
				
			}
		});
	}
}
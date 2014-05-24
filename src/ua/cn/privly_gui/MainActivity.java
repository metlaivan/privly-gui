package ua.cn.privly_gui;

import java.util.ArrayList;

import ua.cn.privly_gui.microblogs.MicroblogListPostsActivity;
import ua.cn.privly_gui.microblogs.Post;
import ua.cn.privly_gui.socialnetworks.SListUserMessagesActivity;
import ua.cn.privly_gui.socialnetworks.SListUsersActivity;
import ua.cn.privly_gui.socialnetworks.SMessage;
import ua.cn.privly_gui.socialnetworks.SUser;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnsosnet = (Button) findViewById(R.id.bSocialNetworks);
		btnsosnet.setOnClickListener(new View.OnClickListener() {

			public void onClick(View paramAnonymousView) {
				ArrayList<SMessage> localArrayList2 = new ArrayList<SMessage>();
				localArrayList2
						.add(new SMessage(
								"hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihhihihihihihihihihihihihihihihihihivhihihihihihihihihihihihihihihihihihihihihihiihi",
								"13.11.1991", "", true));
				localArrayList2
						.add(new SMessage(
								"hishihihihihihihihihihihihihihihihihihihihihihihihivhihihihihihihihihihihihihihihihihihihihishihihihihihihihihihihihihihihihihihihihihihihihivhihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiv",
								"13.11.1991", "", false));
				localArrayList2
						.add(new SMessage("his", "13.11.1991", "", false));
				localArrayList2
						.add(new SMessage("hid", "13.11.1991", "", true));
				ArrayList<SUser> localArrayList1 = new ArrayList<SUser>();

				localArrayList1.add(new SUser("nae", "hi. What are you doing",
						"13.11.2014", "http://", localArrayList2));
				localArrayList1.add(new SUser("naesasdsa",
						"hi. What are you doing", "13.11.2014", "http://",
						localArrayList2));
				localArrayList1.add(new SUser("naessssssssssssssssssss",
						"hi. What are you doing", "13.11.2014", "http://",
						localArrayList2));
				localArrayList1
						.add(new SUser(
								"nae",
								"hi. What are you doingsssssssssssssssss ssssss ssssssssse you doingsssssssssssssssss ssssss sssssssssssssssssse you doingsssssssssssssssss ssssss sssssssssssssssssse you doingsssssssssssssssss ssssss sssssssssssssssssse you doingsssssssssssssssss ssssss sssssssssssssssssse you doingsssssssssssssssss ssssss sssssssssssssssssse you doingsssssssssssssssss ssssss sssssssssssssssssse you doingsssssssssssssssss ssssss sssssssssssssssssse you doingsssssssssssssssss ssssss sssssssssssssssssse you doingsssssssssssssssss ssssss sssssssssssssssssssssssssssssssss sssssssss sssssss",
								"13.11.2014", "http://", localArrayList2));
				localArrayList1
						.add(new SUser(
								"naeddddddddddddd dddddddddddd dddddddddddddddd ddddddddddddddddddddddd",
								"hi. What are you doing", "13.11.2014",
								"http://", localArrayList2));
				localArrayList1.add(new SUser("nae",
						"hi. What are you doingsss sssssssss ssss",
						"13.11.2014", "http://", localArrayList2));
				localArrayList1.add(new SUser("nae", "hi. What are you doing",
						"13.11.2014", "http://", localArrayList2));
				localArrayList1.add(new SUser("nae", "hi. What are you doing",
						"13.11.2014", "http://", localArrayList2));
				localArrayList1.add(new SUser("nae", "hi. What are you doing",
						"13.11.2014", "http://", localArrayList2));
				localArrayList1.add(new SUser("nae",
						"hi. What are you doi ngssss ssssssssssss",
						"13.11.2014", "http://", localArrayList2));
				localArrayList1.add(new SUser("nae", "hi. What are you doing",
						"13.11.2014", "http://", localArrayList2));
				localArrayList1.add(new SUser("nae", "hi. What are you doing",
						"13.11.2014", "http://", localArrayList2));
				localArrayList1.add(new SUser("nae", "hi. What are you doing",
						"13.11.2014", "http://", localArrayList2));
				Intent localIntent = new Intent(MainActivity.this
						.getApplicationContext(), SListUsersActivity.class);
				localIntent.putExtra("UserInfo", localArrayList1);
				startActivity(localIntent);
			}
		});
		Button btnlist = (Button) findViewById(R.id.blistmess);

		btnlist.setOnClickListener(new View.OnClickListener() {
			public void onClick(View paramAnonymousView) {
				ArrayList<SMessage> localArrayList = new ArrayList<SMessage>();
				localArrayList
						.add(new SMessage(
								"hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihhihihihihihihihihihihihihihihihihivhihihihihihihihihihihihihihihihihihihihihihiihi",
								"13.11.1991", "", true));
				localArrayList
						.add(new SMessage(
								"hishihihihihihihihihihihihihihihihihihihihihihihihivhihihihihihihihihihihihihihihihihihihihishihihihihihihihihihihihihihihihihihihihihihihihivhihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiv",
								"13.11.1991", "", false));
				localArrayList
						.add(new SMessage("his", "13.11.1991", "", false));
				localArrayList.add(new SMessage("hid", "13.11.1991", "", true));
				Intent localIntent = new Intent(MainActivity.this
						.getApplicationContext(),
						SListUserMessagesActivity.class);
				localIntent.putExtra("UserMessages", localArrayList);
				startActivity(localIntent);
			}
		});

		Button bMicroblog = (Button) findViewById(R.id.bMicroblog);
		bMicroblog.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				ArrayList<Post> localArrayList = new ArrayList<Post>();
				localArrayList.add(new Post("name1", "@nic", "1 d",
						"sadasdsadsadsa", ""));
				localArrayList.add(new Post("name11111111111111111", "@nic1",
						"1 d", "sadasdsadsadsa", ""));
				localArrayList.add(new Post("name1", "@nic11111111", "1 d",
						"sadasdsadsadsa", ""));
				localArrayList.add(new Post("name1", "@nic", "1 d",
						"sadasdsadsadsa1111111111111111111111111111111111111"
								+ "1111111111111111111111111111111111111111"
								+ "1111111111111111wwwwwwwwwwwwwwwwwwww"
								+ "sssssssssssssssssssssssss"
								+ "dddddddddddddddddddddddddd", ""));
				localArrayList.add(new Post("name1 2222222222 222w wwwwwww wwsss",
						"@nic", "1 d", "sadasdsadsadsa", ""));
				Intent iIntent = new Intent(MainActivity.this
						.getApplicationContext(),
						MicroblogListPostsActivity.class);
				iIntent.putExtra("UserPosts", localArrayList);
				startActivity(iIntent);

			}
		});
	}

}

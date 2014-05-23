package ua.cn.privly_gui.socialnetworks;

import java.util.ArrayList;

import ua.cn.privly_gui.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fedorvlasov.lazylist.ImageLoader;

public class ListUsersAdapter extends BaseAdapter {
	private static LayoutInflater inflater = null;
	private Activity mActivity;
	private ImageLoader mImageLoader;
	private ArrayList<SUser> mListUssers;
	private SUser mSUser;

	public ListUsersAdapter(Activity activity, ArrayList<SUser> list) {
		this.mActivity = activity;
		this.mListUssers = list;
		this.mImageLoader = new ImageLoader(
				this.mActivity.getApplicationContext());
		this.mImageLoader.setStub_id(R.drawable.ava);
	}

	public int getCount() {
		return this.mListUssers.size();
	}

	public Object getItem(int paramInt) {
		return Integer.valueOf(paramInt);
	}

	public long getItemId(int paramInt) {
		return paramInt;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View vi = null;
		if (convertView == null) {
			inflater = this.mActivity.getLayoutInflater();
			vi = inflater.inflate(R.layout.item_socialnetwork_list_users, null);
			ViewHolder viewHolder = new ViewHolder();
			viewHolder.mName = ((TextView) vi.findViewById(R.id.tvUserName));
			viewHolder.mMessage = ((TextView) vi.findViewById(R.id.tvMessage));
			viewHolder.mTine = ((TextView) vi.findViewById(R.id.tvTime));
			viewHolder.mAvatar = ((ImageView) vi.findViewById(R.id.ivAvaFriend));
			vi.setTag(viewHolder);
		} else {
			vi = convertView;
		}

		this.mSUser = ((SUser) this.mListUssers.get(position));
		if (this.mSUser != null) {
			ViewHolder holder = (ViewHolder) vi.getTag();
			holder.mName.setText(this.mSUser.getUserName());
			holder.mMessage.setText(this.mSUser.getLastUserMess());
			holder.mTine.setText(this.mSUser.getTime());
			this.mImageLoader.DisplayImage(this.mSUser.getUrlToAvatar(),
					holder.mAvatar);
		}
		return vi;
	}

	static class ViewHolder {
		protected ImageView mAvatar;
		protected TextView mMessage;
		protected TextView mName;
		protected TextView mTine;
	}
}
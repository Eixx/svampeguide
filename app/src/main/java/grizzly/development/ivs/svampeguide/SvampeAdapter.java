package grizzly.development.ivs.svampeguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Christian Petersen{chpetersen1989@gmail.com}
 * 03-05-2015
 */
public class SvampeAdapter extends RecyclerView.Adapter<SvampeAdapter.SvampeViewHolder> {

        private Context mContext;

        public SvampeAdapter() {
                super();
        }

        @Override
        public SvampeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.svape_cardview_item, parent, false);
                mContext = parent.getContext();
                SvampeViewHolder viewHolder = new SvampeViewHolder(view);
                return viewHolder;
        }

        @Override
        public void onBindViewHolder(SvampeViewHolder holder, int position) {
                holder.mSvampeImage.setImageDrawable(mContext.getResources().getDrawable(R.drawable.svampe_test));
                holder.mFamilieName.setText(mContext.getResources().getString(R.string.lorem));
                holder.mTitle.setText(mContext.getResources().getString(R.string.lorem));
                holder.mLatinName.setText(mContext.getResources().getString(R.string.lorem));
        }

        @Override
        public int getItemCount() {
                return 10;
        }

        public class SvampeViewHolder extends RecyclerView.ViewHolder {

                private TextView mTitle, mLatinName, mFamilieName;
                private ImageView mSvampeImage, mCategoryImage;
                public SvampeViewHolder(View itemView) {
                        super(itemView);
                        mFamilieName = (TextView) itemView.findViewById(R.id.svampe_cardview_familie);
                        mTitle = (TextView) itemView.findViewById(R.id.svampe_cardview_title);
                        mLatinName = (TextView) itemView.findViewById(R.id.svampe_cardview_latin_name);

                        mSvampeImage = (ImageView) itemView.findViewById(R.id.svampe_cardview_imageview);
                        mCategoryImage = (ImageView) itemView.findViewById(R.id.svampe_cardview_category_image);
                }
        }
}

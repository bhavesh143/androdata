package contact.hotline.speeddial.Adapter;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import contact.hotline.speeddial.DbHelper;
import contact.hotline.speeddial.Models.CModel;
import contact.hotline.speeddial.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    ArrayList<CModel> contents;

    static final int TYPE_HEADER = 0;
    static final int TYPE_CELL = 1;

    Context context;
    DbHelper dbHelper;

    public RecyclerViewAdapter(ArrayList<CModel> contents, Context context) {
        this.contents = contents;
        this.context = context;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView namecontact;
        ImageView imagecontact;
        TextView txtcontactname;
        ImageView btnremove;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.namecontact = (TextView) itemView.findViewById(R.id.txt_contact);
            this.imagecontact = (ImageView) itemView.findViewById(R.id.image_contact);
            this.txtcontactname = (TextView) itemView.findViewById(R.id.txt_contactname);
            this.btnremove = (ImageView) itemView.findViewById(R.id.btnremove);



        }
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return TYPE_CELL;
                //return TYPE_HEADER;
            default:
                return TYPE_CELL;
        }
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;

        switch (viewType) {
            case TYPE_HEADER: {
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.griditem_contact, parent, false);
                return new MyViewHolder(view) {
                };
            }
            case TYPE_CELL: {
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.griditem_contact, parent, false);

                return new MyViewHolder(view) {
                };
            }
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        switch (getItemViewType(position)) {
            case TYPE_HEADER:
                final TextView txtName1 = holder.namecontact;
                ImageView imgContact1 = holder.imagecontact;

                imgContact1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {



                    }
                });
                break;
            case TYPE_CELL:

                final TextView txtName = holder.namecontact;
                final ImageView imgContact = holder.imagecontact;
                final ImageView btnRemove = holder.btnremove;
                final TextView txtContactname1 = holder.txtcontactname;
                txtName.setText(contents.get(position).getName());


                if (contents.get(position).getCImage() != null) {
                    imgContact.setImageBitmap(contents.get(position).getCImage());

                } else {
                    if (position % 10 == 0) {
                        imgContact.setImageResource(R.drawable.bg1);
                    } else if (position % 10 == 1) {
                        imgContact.setImageResource(R.drawable.bg2);
                    } else if (position % 10 == 2) {
                        imgContact.setImageResource(R.drawable.bg3);
                    } else if (position % 10 == 3) {
                        imgContact.setImageResource(R.drawable.bg4);
                    } else if (position % 10 == 4) {
                        imgContact.setImageResource(R.drawable.bg5);
                    }else if (position % 10 == 5) {
                        imgContact.setImageResource(R.drawable.bg6);
                    }else if (position % 10 == 6) {
                        imgContact.setImageResource(R.drawable.bg7);
                    }else if (position % 10 == 7) {
                        imgContact.setImageResource(R.drawable.bg8);
                    }else if (position % 10 == 8) {
                        imgContact.setImageResource(R.drawable.bg9);
                    }else if (position % 10 == 9) {
                        imgContact.setImageResource(R.drawable.bg10);
                    }

                    else {
                        imgContact.setImageResource(R.drawable.bg1);
                    }

                    char first = contents.get(position).getName().charAt(0);
                    txtContactname1.setText(String.valueOf(first));
                }

                imgContact.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        if (btnRemove.getVisibility() == View.INVISIBLE){
                            btnRemove.setVisibility(View.VISIBLE);
                            btnRemove.setClickable(true);
                        }
                        else {
                            btnRemove.setVisibility(View.INVISIBLE);
                            btnRemove.setClickable(false);

                        }



                        return false;
                    }
                });

                btnRemove.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dbHelper = new DbHelper(context);
                            String id  = contents.get(position).getID();
                            dbHelper.deleteRecord(id);
                            contents.remove(position);
                        notifyDataSetChanged();

                    }
                });

                imgContact.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Toast.makeText(context,position,Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + contents.get(position).getPhone()));
                        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        context.startActivity(intent);
                    }
                });

                break;
        }


    }}



    /*@Override
    public void onBindViewHolder(RecyclerView.MyViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_HEADER:
                break;
            case TYPE_CELL:

                //Toast.makeText(context,"djndf",Toast.LENGTH_LONG).show();

                break;
        }
    }*/

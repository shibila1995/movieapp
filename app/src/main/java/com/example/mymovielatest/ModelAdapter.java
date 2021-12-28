import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mymovielatest.MovieModel;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<MovieModel> movieModelArrayList;

    public ModelAdapter(Context ctx, ArrayList<MovieModel> movieModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.movieModelArrayList = movieModelArrayList;
    }

    @Override
    public ModelAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.rv_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ModelAdapter.MyViewHolder holder, int position) {

        Picasso.get().load(movieModelArrayList.get(position).getImgURL()).into(holder.iv);
        holder.name.setText(movieModelArrayList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return movieModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView category_name;
        ImageView  category_iv;

        public MyViewHolder(View itemView) {
            super(itemView);


            category_name = (TextView) itemView.findViewById(R.id.category_name);

            category_iv = (ImageView) itemView.findViewById(R.id.category_iv);
        }

    }
}
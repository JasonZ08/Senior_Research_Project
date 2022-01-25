package zhong.jason.seniorresearchproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SFAdapter extends ArrayAdapter<StoringFragment> {
    public SFAdapter(Context context, ArrayList<StoringFragment> sf){
        super(context,0 , sf);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        StoringFragment sf = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_storing, parent, false);
        }
        // Lookup view for data population
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView date = (TextView) convertView.findViewById(R.id.date);
        TextView iURL = (TextView) convertView.findViewById(R.id.image);
        // Populate the data into the template view using the data object
        title.setText(sf.getTitle());
        date.setText(sf.getDate());
        iURL.setText(sf.getImageURL());
        // Return the completed view to render on screen
        return convertView;
    }
}

package ua.com.foxminded.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import ua.com.foxminded.R;

public class TabMaps extends Fragment{

    private ListView listView;
    private View rootView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main_tab_maps, container, false);
//        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        //init();
        return rootView;
    }

    private void init() {
        //listView = rootView.findViewById(R.id.listView);
        /*tableLayout = rootView.findViewById(R.id.table_container);
        tableLayout.setVisibility(LinearLayout.INVISIBLE);*/
    }
}

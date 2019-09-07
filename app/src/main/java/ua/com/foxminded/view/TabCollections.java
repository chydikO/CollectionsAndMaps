package ua.com.foxminded.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import ua.com.foxminded.R;

import static android.support.v4.content.ContextCompat.getSystemService;

public class TabCollections extends Fragment {

    private View rootView;

/*    private LinearLayout tableLayout;
    private ProgressBar progressBar;
    private EditText editText;
    private Button runButton;*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main_tab_collections, container, false);
//        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

        //init();
        return rootView;
    }

 /*   private void init() {
        editText = rootView.findViewById(R.id.edit_text);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER);

        tableLayout = rootView.findViewById(R.id.table_container);
        tableLayout.setVisibility(LinearLayout.INVISIBLE);

        progressBar = rootView.findViewById(R.id.progress_bar);
        setProgressBarVisibility();
    }*/

    /**
     * set ProgressBar visibility
     */
/*    private void setProgressBarVisibility() {
        if (progressBar.getVisibility() == View.GONE) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }*/

    /**
     * action button is activated when the field editText is filled
     */
    /*private void btnActivate() {
        runButton.setEnabled(!TextUtils.isEmpty(editText.getText()));
    }*/
}

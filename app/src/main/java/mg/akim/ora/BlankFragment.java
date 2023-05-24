package mg.akim.ora;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class BlankFragment extends Fragment{

    private EditText txtLogin;
    private EditText txtPassword;
    private Button btnLogin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_blank, container, true);

        txtLogin = (EditText) rootView.findViewById(R.id.txtLogin);
        txtPassword = (EditText) rootView.findViewById(R.id.txtPassword);
        btnLogin = (Button) rootView.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(btnLoginListener);

        return rootView;
    }

    private View.OnClickListener btnLoginListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("ORA", txtLogin.getText() + " / "+txtPassword.getText());
        }
    };
}

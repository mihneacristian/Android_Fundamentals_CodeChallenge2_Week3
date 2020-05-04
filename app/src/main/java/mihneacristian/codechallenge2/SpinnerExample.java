package mihneacristian.codechallenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SpinnerExample extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner mySpinner;
    List<String> androidVersionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_screen3);

        mySpinner = findViewById(R.id.spinnerAndroidVersions);
        mySpinner.setOnItemSelectedListener(this);
        setSpinnerSource();
        mySpinner.setAdapter(getSpinnerAdapter());
    }

    private void setSpinnerSource() {
        androidVersionsList = new ArrayList<>();
        androidVersionsList.add("Cupcake");
        androidVersionsList.add("Donut");
        androidVersionsList.add("Eclair");
        androidVersionsList.add("KitKat");
        androidVersionsList.add("Pie");

    }

    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, androidVersionsList);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(this, "Selected: " + item, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

package castro.inc.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void poundFunction(View convertView){
// testing this eddit.
        EditText currencytText = findViewById(R.id.currencyText);
        Log.i("Amount", currencytText.getText().toString());

        Double currencyTextDouble = Double.parseDouble(currencytText.getText().toString());
        Double poundAmount = .75*(currencyTextDouble);
        Toast.makeText(MainActivity.this, "£" + String.format("%.2f", poundAmount), Toast.LENGTH_LONG).show();
    }

    public void yenFunction(View convertView){

        EditText currencytText = findViewById(R.id.currencyText);
        Log.i("Amount", currencytText.getText().toString());

        Double currencyTextDouble = Double.parseDouble(currencytText.getText().toString());
        Double yenAmount = 111.66*(currencyTextDouble);
        Toast.makeText(MainActivity.this, "¥" + String.format("%.2f", yenAmount), Toast.LENGTH_LONG).show();
    }
    public void pesoFunction(View convertView){

        EditText currencytText = findViewById(R.id.currencyText);
        Log.i("Amount", currencytText.getText().toString());

        Double currencyTextDouble = Double.parseDouble(currencytText.getText().toString());
        Double pesoAmount = 19.02*(currencyTextDouble);
        Toast.makeText(MainActivity.this, "$" + String.format("%.2f", pesoAmount), Toast.LENGTH_LONG).show();
    }
    public void euroFunction(View convertView){

        EditText currencytText = findViewById(R.id.currencyText);
        Log.i("Amount", currencytText.getText().toString());

        Double currencyTextDouble = Double.parseDouble(currencytText.getText().toString());
        Double euroAmount = .90*(currencyTextDouble);
        Toast.makeText(MainActivity.this, "€" + String.format("%.2f", euroAmount), Toast.LENGTH_LONG).show();
        //Testing Comment
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}

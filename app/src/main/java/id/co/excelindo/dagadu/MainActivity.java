package id.co.excelindo.dagadu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    
    CardView cvCreate, cvExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
        gotoCreateActivity();
        gotoExampleActivity();
    }

    private void gotoExampleActivity() {
        cvCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CreateDesignActivity.class);
                startActivity(i);
            }
        });
    }

    private void gotoCreateActivity() {
        cvExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ExampleDesignActivity.class);
                startActivity(i);
            }
        });
    }

    private void init() {
        cvCreate = findViewById(R.id.cv_create_design);
        cvExample = findViewById(R.id.cv_example_design);
    }
}

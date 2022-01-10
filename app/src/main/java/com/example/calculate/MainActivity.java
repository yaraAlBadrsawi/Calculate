package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mult,div
            ,root,dot,equal,clear,remainder;
    private Button deleteLast;
    private Switch mode;
    private TextView result,fNumber;
    private double num1,num2;
    private String operation_type;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.one = findViewById(R.id.one);
        this.two = findViewById(R.id.two);
        this.three = findViewById(R.id.three);
        this.four = findViewById(R.id.four);
        this.five = findViewById(R.id.five);
        this.six = findViewById(R.id.six);
        this.seven = findViewById(R.id.seven);
        this.eight = findViewById(R.id.eight);
        this.nine = findViewById(R.id.nine);
        this.add = findViewById(R.id.add);
        this.sub = findViewById(R.id.sub);
        this.mult = findViewById(R.id.mult);
        this.div = findViewById(R.id.div);
        this.dot = findViewById(R.id.dot);
        this.zero = findViewById(R.id.zero);
        this.root=findViewById(R.id.root);
        this.result = findViewById(R.id.result);
        this.equal = findViewById(R.id.equal);
        this.clear = findViewById(R.id.clear);
       this.mode = findViewById(R.id.mode);
       this.deleteLast=findViewById(R.id.deleteLast);
        this.remainder = findViewById(R.id.remainder);
        this.layout = findViewById(R.id.mainLayout);
        this.fNumber=findViewById(R.id.fNumber);

        num1 = 0;
        num2 = 0;
        operation_type = null;

        this.mode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    layout.setBackgroundColor(getColor(R.color.white2));
                } else {
                    // The toggle is disabled
                    layout.setBackgroundColor(getColor(R.color.black4));

                }

            }
        });

        this.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + zero.getText());
            }
        });
        this.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + one.getText());
            }
        });

        this.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + two.getText());

            }
        });

        this.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + three.getText());
            }
        });

        this.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + four.getText());
            }
        });

        this.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + five.getText());
            }
        });

        this.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + six.getText());
            }
        });

        this.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + seven.getText());
            }
        });

        this.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + eight.getText());
            }
        });
        this.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + nine.getText());
            }
        });

        this.dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + dot.getText());

            }
        });

        this.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation_type = "add"  ;
                fNumber.setText(save_number1()+" + ");

            }
        });

        this.sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation_type = "sub";
                fNumber.setText(save_number1()+" - ");

            }
        });

        this.mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation_type = "mult";
                fNumber.setText(save_number1()+" ✕ ");


            }
        });

        this.div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation_type = "div";
                fNumber.setText(save_number1()+" ÷ ");


            }
        });
        this.remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation_type = "remainder";
                fNumber.setText(save_number1()+" % ");

            }
        });


        this.root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        this.equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation_type != null) {
                    num2 = Double.parseDouble(result.getText().toString() + "");
                }
                if (operation_type.equals("add")) {
                    fNumber.setText(fNumber.getText().toString()+ num2+" = ");
                    result.setText(num1 + num2 + "");

                }
                if (operation_type.equals("sub")) {
                    fNumber.setText(fNumber.getText().toString()+ num2+" = ");
                    result.setText(num1 - num2 + "");

                }
                if (operation_type.equals("mult")) {
                    fNumber.setText(fNumber.getText().toString()+ num2+" = ");
                    result.setText(num1 * num2 + "");

                }

                if (operation_type.equals("div")) {
                    fNumber.setText(fNumber.getText().toString()+ num2+" = ");
                    result.setText(num1 /num2+"");

                }
                if (operation_type.equals("remainder")) {
                    fNumber.setText(fNumber.getText().toString()+ num2+" = ");
                    result.setText(num1 % num2 + "");
                }
                if(operation_type.equals("root")){
                    fNumber.setText(fNumber.getText().toString()+ num2+" = ");
                  //  result.setText(num1 ^ num2+ "");
                }

            }
        });

        this.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
                num1 = 0;
                num2 = 0;
                operation_type = null;
                fNumber.setText(null);

            }
        });

        this.deleteLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = result.getText().toString();
                s = s.substring(0, s.length() - 1);
                result.setText(s);
                }
        });
    }

        public double save_number1() {
                if (!result.getText().toString().isEmpty())
                    num1 = Double.parseDouble(result.getText().toString() + "");
             /*   if(operation_type.equals("add"))
                result.setText(num1+"+ ");
                else if(operation_type.equals("sub"))
                    result.setText(num1+"- ");
                else if(operation_type.equals("mult"))
                    result.setText(num1+"✕ ");
                else if(operation_type.equals("div"))
                    result.setText(num1+" ÷ ");*/

                result.setText(null);
                return num1;

            }
        }
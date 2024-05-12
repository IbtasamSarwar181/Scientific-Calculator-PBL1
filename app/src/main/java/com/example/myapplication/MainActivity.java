package com.example.myapplication;
import android.media.MediaPlayer;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvsec;
    private TextView tvMain;
    private Button bac;
    private Button bc;
    private Button bbrac1;
    private Button bbrac2;
    private Button bsin;
    private Button bcos;
    private Button btan;
    private Button blog;
    private Button bln;
    private Button bfact;
    private Button bsquare;
    private Button bsqrt;
    private Button binv;
    private Button b0;
    private Button b9;
    private Button b8;
    private Button b7;
    private Button b6;
    private Button b5;
    private Button b4;
    private Button b3;
    private Button b2;
    private Button b1;
    private Button bpi;
    private Button bmul;
    private Button bminus;
    private Button bplus;
    private Button bequal;
    private Button bdot;
    private Button bdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hide the action bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        setContentView(R.layout.activity_main);

        tvsec = findViewById(R.id.idTVSecondary);
        tvMain = findViewById(R.id.idTVprimary);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bbrac1 = findViewById(R.id.bbrac1);
        bbrac2 = findViewById(R.id.bbrac2);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bfact = findViewById(R.id.bfact);
        bsquare = findViewById(R.id.bsquare);
        bsqrt = findViewById(R.id.bsqrt);
        binv = findViewById(R.id.binv);
        b0 = findViewById(R.id.b0);
        b9 = findViewById(R.id.b9);
        b8 = findViewById(R.id.b8);
        b7 = findViewById(R.id.b7);
        b6 = findViewById(R.id.b6);
        b5 = findViewById(R.id.b5);
        b4 = findViewById(R.id.b4);
        b3 = findViewById(R.id.b3);
        b2 = findViewById(R.id.b2);
        b1 = findViewById(R.id.b1);
        bpi = findViewById(R.id.bpi);
        bmul = findViewById(R.id.bmul);
        bminus = findViewById(R.id.bminus);
        bplus = findViewById(R.id.bplus);
        bequal = findViewById(R.id.bequal);
        bdot = findViewById(R.id.bdot);
        bdiv = findViewById(R.id.bdiv);

        // Set click listeners for buttons
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();

                tvMain.setText(tvMain.getText().toString() + "1");

                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        // Repeat this pattern for all buttons
        // For brevity, I'll skip the conversion of other button listeners
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();
                tvMain.setText(tvMain.getText().toString() + "2");
                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();
                tvMain.setText(tvMain.getText().toString() + "3");
                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();
                tvMain.setText(tvMain.getText().toString() + "4");
                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();
                tvMain.setText(tvMain.getText().toString() + "5");
                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();
                tvMain.setText(tvMain.getText().toString() + "6");
                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();
                tvMain.setText(tvMain.getText().toString() + "7");
                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();
                tvMain.setText(tvMain.getText().toString() + "8");
                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();
                tvMain.setText(tvMain.getText().toString() + "9");
                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the sound file to play
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                // Start playing the sound
                mediaPlayer.start();
                tvMain.setText(tvMain.getText().toString() + "0");
                // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release(); // Release MediaPlayer resources
                    }
                });
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + ".");
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "+");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "/");
            }
        });

        bbrac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "(");
            }
        });

        bbrac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + ")");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "π");
                tvsec.setText("π");
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "sin(");
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "cos(");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "tan(");
            }
        });

        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "^" + "(-1)");
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "ln(");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "log(");
            }
        });

        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                if (!str.substring(str.length() - 1).equals("-")) {
                    tvMain.setText(str + "-");
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                if (!str.substring(str.length() - 1).equals("*")) {
                    tvMain.setText(str + "*");
                }
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvMain.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    String str = tvMain.getText().toString();
                    double r = Math.sqrt(Double.parseDouble(str));
                    String result = Double.toString(r);
                    tvMain.setText(result);
                }
            }
        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvMain.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    double d = Double.parseDouble(tvMain.getText().toString());
                    double square = d * d;
                    tvMain.setText(Double.toString(square));
                    tvsec.setText(d + "²");
                }
            }
        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvMain.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    int value = Integer.parseInt(tvMain.getText().toString());
                    int fact = factorial(value);
                    tvMain.setText(Integer.toString(fact));
                    tvsec.setText(value + "!");
                }
            }
        });


        // Add click listener for the "AC" button
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText("");
                tvsec.setText("");
            }
        });

        // Add click listener for the "C" button
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                if (!str.equals("")) {
                    str = str.substring(0, str.length() - 1);
                    tvMain.setText(str);
                }
            }
        });

        // Add click listener for the "=" button
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                double result = evaluate(str);
                tvMain.setText(String.valueOf(result));
                tvsec.setText(str);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Create a confirmation dialog
        new AlertDialog.Builder(this)
                .setTitle("MAT JAO!")
                .setMessage("Humy chor kr jo jaogy, bara pashtaogy, bara pashtaogy!")
                .setPositiveButton("Jane do nawww", (dialog, which) -> {
                    // Open YouTube video
                    openYouTubeVideo("https://www.youtube.com/watch?v=2qCmmxT5Fbc");
                })
                .setNegativeButton("Nhi jata", null)
                .show();
    }

    private void openYouTubeVideo(String videoUrl) {
        // Intent to open the YouTube app with the specified video URL
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl));
        intent.putExtra("force_fullscreen", true);
        startActivity(intent);

        // Close the app
        finish();
    }



    // Method to calculate factorial
    private int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    // Method to evaluate expressions
    private double evaluate(String str) {
        try {
            return new Object() {
                int pos = -1;
                int ch;

                void nextChar() {
                    ch = (++pos < str.length()) ? str.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    while (true) {
                        if (eat('+')) x += parseTerm();
                        else if (eat('-')) x -= parseTerm();
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    while (true) {
                        if (eat('*')) x *= parseFactor();
                        else if (eat('/')) x /= parseFactor();
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor();
                    if (eat('-')) return -parseFactor();

                    double x = 0;
                    int startPos = pos;
                    if (eat('(')) {
                        x = parseExpression();
                        eat(')');
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(str.substring(startPos, pos));
                    } else if (eat('π')) {
                        x = Math.PI;
                    } else if (eat('s')) {
                        // Recognize sin function
                        eat('i');
                        eat('n');
                        eat('(');
                        x = Math.sin(parseExpression());
                        eat(')');
                        return x;
                    } else if (eat('c')) {
                        // Recognize cos function
                        eat('o');
                        eat('s');
                        eat('(');
                        x = Math.cos(parseExpression());
                        eat(')');
                        return x;
                    } else if (eat('t')) {
                        // Recognize tan function
                        eat('a');
                        eat('n');
                        eat('(');
                        x = Math.tan(parseExpression());
                        eat(')');
                        return x;
                    } else if (eat('l')) {
                        if (eat('n')) {
                            // Recognize natural logarithm function
                            eat('(');
                            x = Math.log(parseExpression());
                            eat(')');
                            return x;
                        } else if (eat('o')) {
                            // Recognize logarithm function
                            eat('g');
                            eat('(');
                            x = Math.log10(parseExpression());
                            eat(')');
                            return x;
                        }
                    } else {
                        throw new RuntimeException("Unexpected: " + (char) ch);
                    }

                    return x;
                }


            }.parse();
        } catch (Exception e) {
            // Set the error sound file to play
            MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.error);
            // Start playing the error sound
            mediaPlayer.start();
            // Show error message to the user
            Toast.makeText(MainActivity.this, "Error: Bhai kuch sahi likh na", Toast.LENGTH_SHORT).show();
            e.printStackTrace(); // Print the exception details to the console for debugging
            // Add an OnCompletionListener to release the MediaPlayer resources when the sound finishes playing
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release(); // Release MediaPlayer resources
                }
            });
            return Double.NaN; // Return a special value to indicate error
        }
    }
}

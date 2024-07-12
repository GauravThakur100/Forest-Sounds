## Forest Sounds

### Overview

**Forest Sounds** is an Android application designed to provide an interactive and engaging experience with various animal sounds. Users can tap on animal images to hear their corresponding sounds, making it a fun and educational tool for both children and adults. 

### Features

- **User-Friendly Interface**: A simple and intuitive UI with animal cards that users can click to play sounds.
- **Variety of Animal Sounds**: Includes sounds of tiger, elephant, donkey, horse, cat, chicken, dog, goat, and cow.
- **Scroll View for Easy Navigation**: Smooth scrolling through animal cards to access different animal sounds.
- **Stop Previous Sound**: When a new animal card is clicked, the previous sound stops automatically.

### Installation

To run this project on your local machine:

1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/forest-sounds.git
   ```
2. Open the project in Android Studio.
3. Build and run the application on an emulator or a physical device.

### Usage

1. Launch the application.
2. Scroll through the animal cards.
3. Tap on any animal card to play the sound of that animal.
4. Tapping on another animal card will stop the current sound and play the new one.

### Code Highlights

- **MediaPlayer Integration**: Utilizes `MediaPlayer` for handling sound playback.
- **CardView for Layout**: Uses `CardView` to create a visually appealing interface for animal cards.
- **ConstraintLayout and ScrollView**: Combines `ConstraintLayout` and `ScrollView` for a responsive and scrollable layout.

### Example Code

**MainActivity.java:**
```java
package com.example.forestsounds;

import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer currentSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playSound(int soundResourceId) {
        if (currentSound != null) {
            currentSound.release();
        }
        currentSound = MediaPlayer.create(this, soundResourceId);
        currentSound.start();
    }

    public void playTigerSound(android.view.View view) {
        playSound(R.raw.tiger);
    }

    public void playElephantSound(android.view.View view) {
        playSound(R.raw.elephant);
    }

    // Additional playSound methods for other animals...
}
```

**activity_main.xml:**
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/back_new"
    tools:context=".MainActivity">

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="8dp">

            <!-- Example of a CardView for Tiger Sound -->
            <androidx.cardview.widget.CardView
                android:id="@+id/cardViewTiger"
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:layout_margin="8dp"
                android:onClick="playTigerSound"
                app:cardCornerRadius="8dp">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:padding="8dp">

                    <ImageView
                        android:id="@+id/imageViewTiger"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:scaleType="centerCrop"
                        android:src="@drawable/tigerpic" />

                    <Button
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:backgroundTint="@color/white"
                        android:text="Tiger"
                        android:textColor="@color/black" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <!-- Additional CardViews for other animals... -->

        </LinearLayout>
    </ScrollView>
</androidx.constraintlayout.widget.ConstraintLayout>
```

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### Acknowledgments

- Thanks to all contributors and supporters.
- Icons and images used in this project are sourced from free resources and are for educational purposes.

---

This description includes an overview, features, installation steps, usage instructions, code highlights, and additional sections to provide a comprehensive view of your project.

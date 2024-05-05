package com.yoru.gacha;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

class AnimeCharacter {
    private int id;
    private String name;
    private String anime;
    private String image;

    public AnimeCharacter(int id, String name, String anime, String image) {
        this.id = id;
        this.name = name;
        this.anime = anime;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}



public class MainActivity extends AppCompatActivity {

    private int pulls = 0;

    List<AnimeCharacter> getTestCharacters() {
        List<AnimeCharacter> characters = new ArrayList<>();
        characters.add(new AnimeCharacter(1, "Eren Yeager", "Shingeki No Kyojin", "https://static.wikia.nocookie.net/shingeki-no-kyojin/images/6/64/Eren_Jaeger_854_%28Anime%29.png/revision/latest?cb=20210402042845&path-prefix=es"));
        characters.add(new AnimeCharacter(2, "Mikasa Ackerman", "Shingeki No Kyojin", "https://static.wikia.nocookie.net/shingeki-no-kyojin/images/f/f2/Mikasa_Ackerman_854_%28Anime%29.png/revision/latest?cb=20210222031259&path-prefix=es"));
        characters.add(new AnimeCharacter(3, "Sasaki Haise", "Tokyo Ghoul", "https://pm1.aminoapps.com/7116/5d70eed5c797a9bc8126c535ab645629b323a687r1-425-600v2_hq.jpg"));
        characters.add(new AnimeCharacter(4, "Yotsuba Nakano", "Go-Toubun No Hanayome", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/ba780b7c-caf5-4cfe-849d-afbe766e655c/dg62hh6-e20b58b8-8284-4382-b31a-b206374a097a.jpg/v1/fill/w_474,h_842,q_75,strp/yotsuba_nakano_tg_by_kiriya04_dg62hh6-fullview.jpg"));
        characters.add(new AnimeCharacter(5, "Kazuma Satou", "KonoSuba", "https://i.pinimg.com/736x/e5/f6/8c/e5f68ce16b98e39228b3bd6ce9d4612f.jpg"));
        characters.add(new AnimeCharacter(6, "Rimuru Tempest", "Tensei Shitara Slime Datta Ken", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/b5b848ab-3bc9-44c6-b2dc-abe2b7e70ae0/dgeq77r-0a692c44-54b5-4965-a12d-25f29844a050.jpg/v1/fill/w_1920,h_2881,q_75,strp/rimuru_tempest_confident_enhanced_by_kalizakiz_dgeq77r-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9Mjg4MSIsInBhdGgiOiJcL2ZcL2I1Yjg0OGFiLTNiYzktNDRjNi1iMmRjLWFiZTJiN2U3MGFlMFwvZGdlcTc3ci0wYTY5MmM0NC01NGI1LTQ5NjUtYTEyZC0yNWYyOTg0NGEwNTAuanBnIiwid2lkdGgiOiI8PTE5MjAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.xD78-8QVc23bEmUBZYIVx_ZqD7QsoUxz__A3DGhSCUc"));
        characters.add(new AnimeCharacter(7, "Saitama", "One Punch Man", "https://www.mundodeportivo.com/alfabeta/hero/2023/09/estas-son-algunas-de-las-mejores-y-mas-interesantes-curiosidades-sobre-saitama-de-one-punch-man.jpg?width=1200"));
        characters.add(new AnimeCharacter(8, "Naruto Uzumaki", "Naruto", "https://static.wikia.nocookie.net/naruto/images/a/a2/Naruto_Uzumaki_Parte_II_Anime.png/revision/latest?cb=20161013194453&path-prefix=es"));
        characters.add(new AnimeCharacter(9, "Monkey D. Luffy", "One Piece", "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2023/04/one-piece-3006218.jpg?tf=3840x"));
        characters.add(new AnimeCharacter(10, "Gon Freecss", "Hunter x Hunter", "https://static.wikia.nocookie.net/hunterxhunter/images/3/3e/HxH2011_EP147_Gon_Portrait.png/revision/latest?cb=20230904181801"));
        characters.add(new AnimeCharacter(11, "Levi Ackerman", "Shingeki No Kyojin", "https://i.blogs.es/7d3d6a/levi-ackerman/500_333.jpeg"));
        characters.add(new AnimeCharacter(12, "Kaguya Shinomiya", "Kaguya-sama wa Kokurasetai", "https://static.zerochan.net/Shinomiya.Kaguya.full.2917139.png"));
        characters.add(new AnimeCharacter(13, "Sakuta Azusagawa", "Seishun Buta Yarou wa Bunny Girl Senpai no Yume wo Minai", "https://pbs.twimg.com/media/EtnGvyBXEAAyXFo.jpg:large"));
        characters.add(new AnimeCharacter(14, "Raphtalia", "Tate no Yuusha no Nariagari", "https://s1.zerochan.net/Raphtalia.600.2676764.jpg"));
        characters.add(new AnimeCharacter(15, "Zero Two", "Darling in the FranXX", "https://static.wikia.nocookie.net/darling-in-the-franxx/images/9/95/Zerotwomain.jpg/revision/latest?cb=20231115040501"));
        characters.add(new AnimeCharacter(16, "Holo", "Spice and Wolf", "https://www.waifu.com.mx/wp-content/uploads/2023/05/Holo-Cover.jpg"));
        characters.add(new AnimeCharacter(17, "Kanna Kamui", "Kobayashi-san Chi no Maid Dragon", "https://static.wikia.nocookie.net/maid-dragon/images/5/52/Kanna_anime2.jpg/revision/latest?cb=20211124221407&path-prefix=es"));
        characters.add(new AnimeCharacter(18, "Megumin", "KonoSuba", "https://i.pinimg.com/736x/f8/39/41/f839415dc73209edf47161f4678ef1fc.jpg"));
        characters.add(new AnimeCharacter(19, "Rem", "Re:Zero kara Hajimeru Isekai Seikatsu", "https://static.wikia.nocookie.net/rezero/images/0/02/Rem_Anime.png/revision/latest?cb=20210916151323"));
        characters.add(new AnimeCharacter(20, "Pain", "Naruto", "https://www.mundodeportivo.com/alfabeta/hero/2020/12/pain-anime.jpg?width=1200"));
        return characters;
    }

    public void changePFP(String image, ImageView view){
        System.out.println(image);
        Glide.with(this).load(image).into(view);
    };

    private void setUpStatusBar(){
        Window window = getWindow();

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.text, getBaseContext().getTheme()));
        window.getDecorView().setSystemUiVisibility(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView pullsTextView = findViewById(R.id.pulls);
        setUpStatusBar();
        pullsTextView.setText(String.format(getString(R.string.pulls_text), pulls));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button mainButton = findViewById(R.id.main_button);
        Button rerrollButton = findViewById(R.id.rerroll);
        LinearLayout linearLayout  = findViewById(R.id.main_character);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView characterNameTextView = findViewById(R.id.character_name);
                TextView animeNameTextView = findViewById(R.id.anime_name);
                ImageView characterPFPImageView = findViewById(R.id.character_pfp);

                Random random = new Random();
                int index = random.nextInt(getTestCharacters().size());
                AnimeCharacter character = getTestCharacters().get(index);

                characterNameTextView.setText(character.getName());
                pulls += 1;
                pullsTextView.setText(String.format(getString(R.string.pulls_text), pulls));
                animeNameTextView.setText(character.getAnime());
                changePFP(character.getImage(), characterPFPImageView);

                mainButton.setVisibility(View.GONE);
                rerrollButton.setVisibility(View.VISIBLE);
                linearLayout.setVisibility(View.VISIBLE);
            }
        });

        rerrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pulls == 10) {
                    pulls = 0;
                    mainButton.setVisibility(View.VISIBLE);
                    rerrollButton.setVisibility(View.GONE);
                    linearLayout.setVisibility(View.GONE);
                    pullsTextView.setText(String.format(getString(R.string.pulls_text), pulls));
                    return;
                }

                TextView characterNameTextView = findViewById(R.id.character_name);
                TextView animeNameTextView = findViewById(R.id.anime_name);
                ImageView characterPFPImageView = findViewById(R.id.character_pfp);

                Random random = new Random();
                int index = random.nextInt(getTestCharacters().size());
                AnimeCharacter character = getTestCharacters().get(index);
                pulls += 1;

                pullsTextView.setText(String.format(getString(R.string.pulls_text), pulls));
                characterNameTextView.setText(character.getName());
                animeNameTextView.setText(character.getAnime());
                changePFP(character.getImage(), characterPFPImageView);
            }
        });
    }
}
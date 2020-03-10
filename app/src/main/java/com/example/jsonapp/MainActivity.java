package com.example.jsonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String questionsJson="{\"response_code\":0,\"results\":[{\"category\":\"Mythology\",\"type\":\"multiple\",\"difficulty\":\"easy\",\"question\":\"The ancient Roman god of war was commonly known as which of the following?\",\"correct_answer\":\"Mars\",\"incorrect_answers\":[\"Jupiter\",\"Juno\",\"Ares\"]},{\"category\":\"Mythology\",\"type\":\"multiple\",\"difficulty\":\"easy\",\"question\":\"Who in Greek mythology, who led the Argonauts in search of the Golden Fleece?\",\"correct_answer\":\"Jason\",\"incorrect_answers\":[\"Castor\",\"Daedalus\",\"Odysseus\"]},{\"category\":\"Mythology\",\"type\":\"multiple\",\"difficulty\":\"easy\",\"question\":\"Who was the King of Gods in Ancient Greek mythology?\",\"correct_answer\":\"Zeus\",\"incorrect_answers\":[\"Apollo\",\"Hermes\",\"Poseidon\"]},{\"category\":\"Mythology\",\"type\":\"boolean\",\"difficulty\":\"easy\",\"question\":\"According to Greek Mythology, Zeus can control lightning.\",\"correct_answer\":\"True\",\"incorrect_answers\":[\"False\"]},{\"category\":\"Mythology\",\"type\":\"multiple\",\"difficulty\":\"easy\",\"question\":\"In Greek mythology, who is the god of wine?\",\"correct_answer\":\"Dionysus\",\"incorrect_answers\":[\"Hephaestus\",\"Demeter\",\"Apollo\"]},{\"category\":\"Mythology\",\"type\":\"boolean\",\"difficulty\":\"easy\",\"question\":\"According to Greek Mythology, Atlas was an Olympian God.\",\"correct_answer\":\"False\",\"incorrect_answers\":[\"True\"]},{\"category\":\"Mythology\",\"type\":\"multiple\",\"difficulty\":\"easy\",\"question\":\"Which of these mythological creatures is said to be half-man and half-horse?\",\"correct_answer\":\"Centaur\",\"incorrect_answers\":[\"Minotaur\",\"Pegasus\",\"Gorgon\"]},{\"category\":\"Mythology\",\"type\":\"multiple\",\"difficulty\":\"easy\",\"question\":\"What mythology did the god &quot;Apollo&quot; come from?\",\"correct_answer\":\"Greek and Roman\",\"incorrect_answers\":[\"Roman and Spanish\",\"Greek and Chinese\",\"Greek, Roman and Norse\"]},{\"category\":\"Mythology\",\"type\":\"boolean\",\"difficulty\":\"easy\",\"question\":\"A wyvern is the same as a dragon.\",\"correct_answer\":\"False\",\"incorrect_answers\":[\"True\"]},{\"category\":\"Mythology\",\"type\":\"multiple\",\"difficulty\":\"easy\",\"question\":\"What mytological creatures have women&#039;s faces and vultures&#039; bodies?\",\"correct_answer\":\"Harpies\",\"incorrect_answers\":[\"Mermaids\",\"Nymph\",\"Lilith\"]}]}";
        try {
            JSONObject questionObj = new JSONObject(questionsJson);
            JSONArray results = questionObj.getJSONArray("results");
            JSONObject singleObj=new JSONObject(results.get(0).toString());
            String question= singleObj.getString("question");



            Log.d("tag_singleObj", "onCreate:" +question);
        } catch (JSONExc
        }


    }
}

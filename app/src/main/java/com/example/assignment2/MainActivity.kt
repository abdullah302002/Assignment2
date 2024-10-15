package com.example.assignment2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val recyclerview: RecyclerView = findViewById(R.id.recyclerview)
        val adapter = ArticleAdapter(getArticles())
        recyclerview.adapter = adapter
    recyclerview.layoutManager=LinearLayoutManager(this)
    }



     fun getArticles():List<Article>{
     return listOf(
         Article("ENGLAND TOUR OF PAKISTAN, 2024","Salman, Shakeel take Pakistan above 500","In Pakistan's innings, Saud Shakeel and Salman Ali Agha played crucial roles in taking their team beyond the 500-run mark. Shakeel delivered a solid performance, contributing a composed knock, while Salman continued to accelerate the scoring, ensuring Pakistan built a commanding total."
         ,"Tom Latham is no stranger to Test captaincy, being New Zealand's go-to for seamlessly slipping into big leadership boots as a stand-in. Yet, this latest trip to India should add a little more weight to his broad shoulders as he arrives with what is officially his New Zealand squad. The captain's seat is not for him to keep warm in the temporary absence of an incumbent anymore - it comes with his name in block letters and a sense of permanence. But this take over comes engulfed in a struggle with form, consistency and inevitable transition.\n" +
                     "\n" +
                     "There's enough evidence in the 137 years of its existence that progress for a Test side can't always be linear. Less than four years ago, Kane Williamson and Ross Taylor saw New Zealand through to the maiden WTC crown in Southampton against an Indian team that made such rapid strides that it called into question the very format of the competition where the champion was crowned based on a one-off final. Since then the two teams have charted very different looking graphs in whites.", R.drawable.img1),
        Article("ENGLAND TOUR OF PAKISTAN, 2024", "Ollie Pope credits tempo of Brook-Root stand for Multan win", "England pulled off a historic innings win despite conceding 556 in the first innings", "England achieved a historic victory over Pakistan in the first Test in Multan, despite conceding a massive 556 runs in Pakistan's first innings. England responded with a remarkable total of 823/7 declared, driven by a record-breaking partnership of 454 runs between Joe Root and Harry Brook. Root scored 250, while Brook made a career-best 317, setting the stage for England's dominant position.\n" +
                "\n" +
                "On the final day, England needed just three wickets, with Pakistan at 82/6 in their second innings. Jack Leach took four wickets as Pakistan's resistance crumbled, and with Abrar Ahmed absent due to illness, England sealed the win by an innings and 47 runs. This victory marked several historic feats: no team had ever conceded over 550 runs in an innings and still won by an innings\u200B\n" +
                "ICC\n" +
                "\n" +
                "This win also saw Root surpass Alastair Cook to become England’s highest run-scorer in Test cricket\u200B\n" +

                ". The match was a testament to England’s aggressive \"Bazball\" approach, adding to their series of notable overseas victories",R.drawable.img3),
        Article("ICC WOMEN'S T20 WORLD CUP 2024", "Gardner takes four in rout of Pakistan", "Australia chased down a target of 82 in just 11 overs for their 14th straight win in T20 World Cups", "Australia secured their 14th consecutive T20 World Cup victory in a dominant display by chasing down a target of 82 runs in just 11 overs. Their bowlers, led by an impressive bowling attack, quickly dismantled the opposition. Key performances came from their pace unit, which wreaked havoc early on, leaving the opposing team with little chance to build momentum.\n" +
                "\n" +
                "The top order of the Australian batting lineup ensured there were no hiccups in the chase, with aggressive yet calculated batting. The match was essentially a one-sided affair, reflecting Australia’s continued dominance in T20 cricket.\n" +
                "\n" +
                "This victory extended their winning streak to 14 matches, placing them in a commanding position in the tournament, with every game solidifying their position as a strong contender for the title\u200B",R.drawable.img4),
        Article("SOUTH AFRICA TOUR OF BANGLADESH, 2024", "Bavuma ruled out of first Test; Brevis earns maiden call-up", "Meanwhile, Lungi Ngidi has been added to the squad as Nandre Burger's replacement", "Lungi Ngidi has been added to South Africa’s white-ball squads for their series against Afghanistan and Ireland after recovering from a right calf injury. Ngidi had been sidelined but has now fully recovered and is included in both the ODI and T20I squads for these matches. This tour is an important one for South Africa as it allows fringe players to gain international exposure, with coach Rob Walter focusing on building a wider player pool ahead of upcoming ICC tournaments.\n" +
                "\n" +
                "Ngidi's inclusion comes as a boost to the squad, especially considering his limited appearances since last November. He was part of South Africa's ICC T20 World Cup squad but did not play any matches. Nandre Burger, a left-arm seamer, was initially selected but has been replaced by Ngidi\u200B",R.drawable.img5),
        Article("ICC WOMEN'S T20 WORLD CUP 2024", "With destiny in their own hands, New Zealand eye big win", "Despite the setback against Australia, comfortable wins over Sri Lanka and Pakistan will keep New Zealand on track for a berth in the final four\n" +
                "SAvBAN / South Africa out to win big and edge closer to semifinal berth","outh Africa is heading into their match against Bangladesh with a strong desire to win big and secure their spot in the semifinals of the ICC Cricket World Cup 2023. Having already recorded significant victories, they are in good form. South Africa will be looking to capitalize on their strengths, especially with standout performances from players like Quinton de Kock and Heinrich Klaasen, who have been in excellent form throughout the tournament. Marco Jansen has also contributed with both bat and ball, but his economy rate remains an area of improvement\u200B\n" +
                "CRICBUZZ\n" +
                "\u200B\n" +
                "REDIFF\n" +
                ".\n" +
                "\n" +
                "Bangladesh, on the other hand, has struggled throughout the tournament, and they will need a special effort to halt South Africa’s momentum. South Africa’s strategy is likely to focus on dominating with their explosive batting lineup and aiming for a high net run rate, which could prove crucial in the final stages of the competition\u200B\n", R.drawable.img6),
        Article("US CRICKET", "National Cricket League USA: Concerns over sanctioning, player regulations, and on-field standards", "The National Cricket League in the United States, which follows on the heels of last year's American Premier League, has raised concerns regarding its adherence to international standards and operational integrity.","The rise of the National Cricket League (NCL) in the United States has stirred considerable attention, especially since it follows in the footsteps of the American Premier League (APL) from last year. The excitement around professional cricket in the U.S. has been palpable, as both leagues aim to tap into the country’s growing interest in the sport. However, the rapid emergence of these leagues has raised serious concerns about their adherence to international standards and the operational integrity required for a sustainable and reputable cricket competition.\n" +
                "\n" +
                "The NCL, much like the APL before it, has faced scrutiny from various stakeholders in the global cricket community. At the heart of the concerns is whether the league’s organizational practices align with the stringent standards set by the International Cricket Council (ICC). Questions have been raised about the league's governance, transparency in team selections, financial accountability, and whether the playing conditions meet international benchmarks. For example, critics have pointed out that some of the grounds and facilities being used for matches may not be up to par with what is expected at a global level.\n" +
                "\n" +
                "Furthermore, operational challenges have also come to light. The sudden boom of professional cricket leagues in the U.S. has led to worries about long-term viability. While the NCL and APL have attracted interest from both local and international players, the infrastructure to support these leagues may not be fully established yet. Issues like player contracts, broadcasting rights, and revenue models remain topics of debate, with some suggesting that these leagues may have expanded too quickly, risking the sustainability of the sport in the region.\n" +
                "\n" +
                "The passion for cricket in the U.S. is undeniable, and there’s tremendous potential for the sport to grow in a market that is largely untapped. However, without strong governance and a focus on long-term planning, there’s a fear that leagues like the NCL could struggle to maintain credibility, especially when compared to more established leagues in other cricketing nations. For the NCL to truly succeed, it will need to address these operational and structural issues, ensuring that it can meet international standards while fostering genuine growth in the sport.", R.drawable.img7),
        Article("SRI LANKA CRICKET", "Jayasuriya appointed full-time head coach of Sri Lanka", "The former Sri Lankan all-rounder who had served as the interim head coach since July this year, will have his contract running till March 2026", "Sanath Jayasuriya, the legendary Sri Lankan all-rounder, has been appointed as the permanent head coach of the Sri Lankan men's cricket team until March 2026. His role was extended following successful results during his tenure as interim coach, where Sri Lanka recorded key victories, including a historic ODI series win over India and Test match victories against England and New Zealand.\n" +
                "\n" +
                "Initially brought in as an interim coach in July 2024, Jayasuriya's success in improving the team's performance led Sri Lanka Cricket (SLC) to offer him a full-time role. His contract will run through significant upcoming events, such as the 2025 ICC Champions Trophy and potentially the World Test Championship final in 2026.",R.drawable.img8)
     )
    }


}
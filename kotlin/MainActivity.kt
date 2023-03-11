/**
 * @author m_miyashita
 * @version 2022/12/22
 */
package com.example.ss_2022gakukey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val keyData = ArrayList<String>()
        //xmlにて実装したlistViewの取得
        val listView = findViewById<ListView>(R.id.listView)
        //ArrayAdapterの生成
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, keyData )
        //ListViewに生成したAdapterを設定
        listView.adapter = adapter

        val key = "記号 :"
        val keyName = "調名 : "
        val dominanto  = "導音 : "
        val ambience = "調の雰囲気 :"
        //要素を追加(記号, 調名, )
        keyData.addAll(listOf( "$key -", "$keyName ハ長調 ", "$dominanto B", "$ambience 単純、素朴、しかも画然とした感じ"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key -","$keyName イ短調 ","$dominanto G","$ambience 単純な素朴な柔らかい悲しみ、最も女性的、敬神的な諦めに似た感情を出す"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #1", "$keyName ト長調", "$dominanto #F", "$ambience 若人の調、誠意、瞑想、優美、静かな田園的な感情。 春"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #1", "$keyName ホ短調","$dominanto D", "$ambience 悲観、悲痛、不安、速い曲では激烈なものとなる。"))
        keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #2","$keyName 二長調", "$dominanto #C", "$ambience 高尚で華美、雄大で宗教的、特に歓喜に適する。 活発なファンファーレにも用いられる。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #2","$keyName ロ短調", "$dominanto A", "$ambience 非常に暗く憂愁であるが静かな期待と辛抱強い希望をほのめかす。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #3","$keyName イ長調", "$dominanto #F", "$ambience 輝かしく確信と希望に満ちる。 単純、純粋、快活、誠実な感情に適する。\n"))
         keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #3","$keyName 嬰へ短調", "$dominanto E", "$ambience 暗く神秘的、妖怪的、同じに情熱的\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #4","$keyName イ長調", "$dominanto #F", "$ambience 輝かしく確信と希望に満ちる。 単純、純粋、快活、誠実な感情に適する。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #4","$keyName 嬰へ短調", "$dominanto E", "$ambience 暗く神秘的、妖怪的、同じに情熱的\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #5","$keyName ロ長調", "$dominanto #A", "$ambience 積極的になると大胆な誇りを表し消極的になると清潔な純粋さを表す。 情力敵なこともある。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #5","$keyName 嬰ト短調", "$dominanto #F", "$ambience 非常に陰暗で音響効果に乏しい。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #6","$keyName 嬰ヘ長調", "$dominanto #E", "$ambience 色彩的、豊かさと柔らか味を持つ。 特にロマン的な趣。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))

        keyData.addAll(listOf("$key #6","$keyName 嬰二短調", "$dominanto #C", "$ambience 最も陰暗な陰気な調の1つ。 シューマンによると神秘的な恐怖に満ちた調\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #7","$keyName 嬰ハ長調", "$dominanto #B", "$ambience ハ長調より典雅で明朗で輝かしい。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key #7","$keyName 嬰イ短調", "$dominanto #G", "$ambience 変ロ短調と共に葬送行進曲向き。 陰暗で憂鬱で悲劇的\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭1","$keyName ヘ長調", "$dominanto E", "$ambience 平和、単純、素朴、牧歌的、田園的、低い音を多く使うと痛々しい感情を出し、穏やかな曲では荘重だかあまり宗教敵ではない感じを出す。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))

        keyData.addAll(listOf("$key ♭1","$keyName 二短調", "$dominanto C", "$ambience 不安、悲観、荘厳、崇高 シューマンによると巨大な力を持つ調\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭2","$keyName 変ロ長調", "$dominanto A", "$ambience ゆったりとした感じを出す。 柔和な輝かしさ、静かさで瞑想的なところもある\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭2","$keyName ト短調", "$dominanto F", "$ambience 悲しみ、夢のような憂愁の加わった静かなやさしさ、真剣な努力を表す。 時にはロマン的な高揚を感じさせる。 感傷味、特に効果的に伝える暗い調。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭3","$keyName 変ホ長調", "$dominanto D", "$ambience 柔和な中にも悠然さを持ち、響きが充実し、華麗で荘重最大の変化の表出に適すると言われる。 特に真剣な感情、壮大あるいは英雄的な気分を表すのによく使われる。 青空の調とも言う。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭3","$keyName ハ短調", "$dominanto B", "$ambience 柔和の中に真剣な情熱を持つ。 悲劇的な力、超自然的な感情、激烈な感情\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭4","$keyName 変イ長調", "$dominanto G", "$ambience 夢想的で繊細、杼情的で荘厳、生き生きとして新鮮。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭4","$keyName へ短調", "$dominanto ♭E", "$ambience 悲惨な調。 憂うつ、暗い情熱\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭5","$keyName 変ニ長調", "$dominanto B", "$ambience 魅惑的、深刻、荘厳、長調の中で最も暗く痛々しい調の1つ。 病的なロマン性\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭5","$keyName 変ロ短調", "$dominanto ♭A", "$ambience 変イ短調と共に葬送行進曲向き。 陰暗で憂うつで悲劇的\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭6","$keyName 変ト長調", "$dominanto F", "$ambience 優和で華美。 嬰へ長調より深い感情を示すこともある。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭6","$keyName 変ホ短調", "$dominanto ♭D", "$ambience 最も陰暗な陰気な調の1つ。 シューマンによると、神秘的な恐怖に満ちた調\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭7","$keyName 変ハ長調", "$dominanto ♭B", "$ambience 積極的になると大胆な誇りを表し、消極的になると清潔な純粋さを表す。 情力的なこともある。\n"))
        keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
        keyData.addAll(listOf("$key ♭7","$keyName 変イ短調", "$dominanto ♭G", "$ambience 悲愴で心を裂くような効果を起こす。\n"))
            keyData.addAll(listOf( "-----------------------------------------------------------------------------"))
    }
}

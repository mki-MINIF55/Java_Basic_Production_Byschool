import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;

/* ﾒｿｯﾄﾞ集約ｸﾗｽ
 * A 文字列を入力するメソッド inputString() @return inputWord 入力値
 * ISR、BR使用
 * B csvから読み込みArrayListの配列にし格納し拡張for分で読み込んだ全てのArrayListをｺﾝｿｰﾙに表示するﾒｿｯﾄﾞ array_List() @return arry_Data
 * ISR、FIS、ISR、BR使用
 * C csvから読み込みArrayListを配列にし格納したArrayList[]から判定した結果をｺﾝｿｰﾙに表示するﾒｿｯﾄﾞ arry_Serch_Data() @return arry_Serch_Data
 * ISR、FIS、ISR、BR使用
 *
 * @author Miyashita m
 * @version 2022 12/6
 */

// ----------------------------------------------------------------

public class Methods {

  /**
   * A 文字列を入力するメソッド
   *
   * @param なし
   * @return inputWord 入力値
   */
  public static String inputString() {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    String inputWord = "";
    try {
      inputWord = reader.readLine();
    } catch (IOException e) {
      System.out.println(e);
    }
    return inputWord;
  }

  // ----------------------------------------------------------------
  /**
   * B csvから読み込みArrayListの配列にし格納し
   *  拡張for分で読み込んだ全てのArrayListをｺﾝｿｰﾙに表示するﾒｿｯﾄﾞ
   *
   *
   * @param なし
   * @return arry_Data
   */
  public static String array_List() {
    /*
     * ファイル読み込み用のBRを用意
     **/
    FileInputStream file = null;
    InputStreamReader isr = null;
    BufferedReader reader = null;
    String arry_Data = "";

    try {
      file = new FileInputStream("gaku-key.csv");
      isr = new InputStreamReader(file);
      reader = new BufferedReader(isr);

      //csvから読み込んだ用ArrayList
      List<String[]> arrData = new ArrayList<String[]>();

      //行数管理
      int intRow = 1;
      // 読み込み行
      String line;

      // 一行ずつ読み込みを行う 空白行になるまで読み込み
      while ((line = reader.readLine()) != null) {
        // カンマ区切りを配列に格納する
        arrData.add(line.split(","));
      }
      reader.close();

      // 配列の中身を順位表示 列数(=列名を格納した配列の要素数)分繰り返す
      for (String[] arrs : arrData) {
        // 出力 (行番号 + "記号" + "調名"+ "導音"+ "調の雰囲気");
        System.out.println(Constant.LINE);
        System.out.println(intRow + ":   " + Constant.KEY + arrs[0]);
        System.out.println("       " + Constant.KEY_NAME + arrs[1]);
        System.out.println("       " + Constant.DOMINANTO + arrs[2]);
        System.out.println("       " + Constant.KEY_FEELING + arrs[3]);

        // 行数のｲﾝｸﾘﾒﾝﾄ
        intRow++;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return arry_Data;
  }

  // ----------------------------------------------------------------
  /**
   * C csvから読み込みArrayListを配列にし格納したArrayList[]から判定した結果をｺﾝｿｰﾙに表示するﾒｿｯﾄﾞ
   * @param なし
   * @return arry_Serch_Data
   */
  public static String array_Serch_List() {
    /*
     * ファイル読み込み用のBRを用意
     **/
    FileInputStream file = null;
    InputStreamReader isr = null;
    BufferedReader reader = null;
    String arry_Serch_Data = "";

    try {
      file = new FileInputStream("gaku-key.csv");
      isr = new InputStreamReader(file);
      reader = new BufferedReader(isr);

      //csvから読み込んだ用ArrayList
      List<String[]> arrData = new ArrayList<String[]>();

      // 読み込み行
      String line;

      // 一行ずつ読み込みを行う 空白行になるまで読み込み
      while ((line = reader.readLine()) != null) {
        // カンマ区切りを配列に格納する
        arrData.add(line.split(","));
      }
      reader.close();

      // 配列の中身を順位表示 列数(=列名を格納した配列の要素数)分繰り返す
      for (String[] arrs : arrData) {
        // 検索結果出力
        int srechCount = 0;

        // 入力をもらう Aメソッド
        String input = inputString();

        //検索用ｶﾞｲﾄﾞ表示
        System.out.println(Constant.INPUT_GUIDE + input);

        // 入力が空だったとき処理中断
        if (input.equals("")) {
          System.out.println(Constant.PROCESS_ABORTIVE);
          break;
        }
        // 入力した値から検索結果を出力するメソッド
        for (String[] arrc : arrData) {
          if (input.equals(arrc[0])) {
            // 出力 (行番号 + "記号" + "調名"+ "導音"+ "調の雰囲気");
            System.out.println();
            System.out.println(Constant.HIT);
            System.out.println(Constant.KEY + "       " + arrc[0]);
            System.out.println(Constant.KEY_NAME + "       " + arrc[1]);
            System.out.println(Constant.DOMINANTO + "       " + arrc[2]);
            System.out.println(Constant.KEY_FEELING + " " + arrc[3]);
            System.out.println(Constant.LINE);
            // 検索ｶｳﾝﾄｲﾝｸﾘﾒﾝﾄ srechCount
            srechCount++;
          }
        }
        //検索するときに一致しなかったとき
        if (srechCount == 0) {
          System.out.println("  " + Constant.NG_HIT + " " + input);
        }
        break;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return arry_Serch_Data;
  }
}

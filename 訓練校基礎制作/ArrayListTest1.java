import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* ｺﾝｿｰﾙに表示のﾒｲﾝｸﾗｽ
 * @author Miyashita m
 * @version 2022 12/6
 */

public class ArrayListTest1 {

  public static void main(String[] args) {
    /*  ﾃﾞｰﾀをｺﾝｿｰﾙに表示
     *CSVから読み込んだArrayListの表示
     * bﾒｿｯﾄﾞ
     */

    Methods.array_List();
    System.out.println(Constant.LINE);

    // 検索用入力案内表示
    System.out.println(Constant.START_GUIDE);
    //検索結果ﾒｿｯﾄﾞ C
    Methods.array_Serch_List();
  }
}

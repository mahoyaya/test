// Java
public class Main {
  public static void main(String[] args){
    int i = 1; // 整数の型
    double d = 0.1; // 実数の型
    //int int_sum = i + d; // 型が違うのでコンパイルエラー
    int int_sum = i + new Double(d).intValue(); // 型を合わせればエラーにはならないが、整数に変換されるので、結果は1になってしまう
    double double_sum = i + d; // この場合は勝手に変換してくれる
    System.out.println(int_sum);
    System.out.println(double_sum);

    // コメント

    // 文字列の場合は変換されない
    String s = "9";
    //int i2 = i + s; // 型が違うのでコンパイルエラー
    System.out.println(i+s); // 19 print関数の場合は結合になる
    System.out.println(s+i); // 91 上記と同様

    int foo = 0.1;
  }
}

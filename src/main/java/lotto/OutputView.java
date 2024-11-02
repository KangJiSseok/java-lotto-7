package lotto;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    int count;

    ArrayList<List<Integer>> lotto = new ArrayList<>();

    public OutputView(int count, ArrayList<List<Integer>> lotto) {
        this.count = count;
        this.lotto = lotto;
    }

    public void buyCountPrint() {
        System.out.println(count + "개를 구매했습니다.");
    }

    public void lottosPrint() {
        for (List<Integer> lottoList : lotto) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (Integer value : lottoList) {
                sb.append(value + ", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append("]");
            System.out.println(sb.toString());
        }
    }
}

package yaoxintong;

import java.util.List;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;

public class Ansj_seg_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "生发";
		List<Term> terms = ToAnalysis.parse(str).getTerms();
		for (Term term : terms) {
			System.out.println(term.getName());
			System.out.println(term.getNatureStr());
			System.out.println(term.getOffe());
			System.out.println(term.score());
//			System.out.println(term.getFreq());
			System.out.println(term.getSynonyms());
		}
		// SmartForest<List<String>> smartForest = SynonymsLibrary.get();
		// System.out.println(smartForest.getBranch("生发").getParam().get(0));
		// Forest forest = DicLibrary.get();
		// System.out.println(forest.getBranch("头疼").getParam()[1]);

	}

}

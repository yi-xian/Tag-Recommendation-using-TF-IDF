package hadoop.yixian.space;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.ToolRunner;


public class RecommendationSystem {

	public static void main(String[] args) throws Exception {
		
		
		String HDFSAddr = "hdfs://localhost:8020/";
		String originalFile = HDFSAddr + "tag.dat"; 
		String folderAddr = HDFSAddr + "TAG/";
		
		
		
		String[] address = {HDFSAddr+"delicious.dat",HDFSAddr+"tag.data"};		
		int res = ToolRunner.run(new Configuration(), new MapRed1Driver(), address);
		
			
	}
	


		
}
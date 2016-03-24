package hadoop.yixian.space;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.ToolRunner;


public class RecommendationSystem {

	public static void main(String[] args) throws Exception {
		
		
		String HDFSAddr = "hdfs://localhost:8020/";
		String originalFileAddr = HDFSAddr + "tag.dat"; 
		String folderAddr = HDFSAddr + "TAG/";
		
		
		
		String[] address = {originalFileAddr,folderAddr+"M1"};		
		int res = ToolRunner.run(new Configuration(), new MapRed1Driver(), address);
		
			
	} 
	


		
}
package hadoop.yixian.space;

import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Reducer1 extends Reducer<Text, Text, Text, Text>{

	
	@Override
	protected void reduce(Text key, Iterable<Text> values, Reducer<Text, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
	
		Integer count = 0;
		for(Text val : values){
			count++;
		}
		context.write(new Text(key), new Text(count.toString()));
		
	}
}

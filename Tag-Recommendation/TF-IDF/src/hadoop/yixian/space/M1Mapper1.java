package hadoop.yixian.space;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class M1Mapper1 extends Mapper<Object, Object, Text, Text>{
	@Override
	protected void map(Object key, Object value, Mapper<Object, Object, Text, Text>.Context context)
			throws IOException, InterruptedException {
		
		
		String[] split = value.toString().split("\t");
		String[] tags = split[2].split(" ");
		
		
		//key:urlID tag      value: 1
		for(int i = 0 ; i < tags.length ; i++) {
			context.write(new Text(split[1]+"\t"+tags[i]), new Text("count"));
		}
	}
}

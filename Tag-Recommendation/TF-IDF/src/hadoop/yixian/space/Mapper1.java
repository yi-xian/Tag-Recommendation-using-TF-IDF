package hadoop.yixian.space;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mapper1 extends Mapper<Object, Object, Text, Text>{
	@Override
	protected void map(Object key, Object value, Mapper<Object, Object, Text, Text>.Context context)
			throws IOException, InterruptedException {
		
		
		String[] split = value.toString().split("\t");
		
		//key:urlID tag      value: 1
		context.write(new Text(split[0]+"\t"+split[1]), new Text("count"));
				
	}
}

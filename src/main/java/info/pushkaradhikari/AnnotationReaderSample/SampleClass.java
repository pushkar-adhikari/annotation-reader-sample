package info.pushkaradhikari.AnnotationReaderSample;

import java.util.List;

import info.pushkaradhikari.AnnotationReader.NitAnnotationReader;
import info.pushkaradhikari.AnnotationReader.ReaderType;

public class SampleClass {
	
	public static void main(String[] args) {
		
		NitAnnotationReader readerA = new NitAnnotationReader();
		List<String> listA = readerA.configureReader(Deprecated.class, ReaderType.METHOD).fetch();
		for (String value : listA) {
			System.out.println(value);
		}
		
		NitAnnotationReader readerB = new NitAnnotationReader();
		List<String> listB = readerB.reader.fetch();
		for (String value : listB) {
			System.out.println(value);
		}
	}
	
	@Deprecated
	public void sampleDeprecatedMethod(){
		
	}
	
}

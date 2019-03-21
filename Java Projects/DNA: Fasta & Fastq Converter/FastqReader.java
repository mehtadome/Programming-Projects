package dna;

import java.io.*;


//
// Reads lines from a BufferedReader and builds a FastqRecord.
//

public class FastqReader 
{
	private BufferedReader theBufferedReader;
	
	public FastqReader(BufferedReader theBufferedReader) {
		
		this.theBufferedReader = new BufferedReader(theBufferedReader);
	}
	
	// Returns next record in the file, or null if EOF (end-of-file).
	public FastqRecord readRecord() throws IOException, RecordFormatException
	{
		// Read the defline from the BufferedReader. Return null if you read null, 
		// indicating end of file.
		
		String defline = theBufferedReader.readLine();
		
		if(defline == null) {
			return null;
		}
		
		//Reads the next three lines of the record
		String sequence = theBufferedReader.readLine();
		String plus = theBufferedReader.readLine(); //weird "+" sign
		String quality = theBufferedReader.readLine();			
				
		// Constructs and returns new FastqRecord
		FastqRecord fastqq = new FastqRecord(defline, sequence, quality); 
		return fastqq; 
	}
}

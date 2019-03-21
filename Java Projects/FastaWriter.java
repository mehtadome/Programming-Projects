package dna;

import java.io.*;

//
// Writes a fasta record to a print writer.
//

public class FastaWriter 
{
	PrintWriter thePrintWriter;

	public FastaWriter(PrintWriter thePrintWriter) {
		
		this.thePrintWriter = thePrintWriter;
	}
	
	// Writes the Fasta Record using PrintWriter
	public void writeRecord(FastaRecord rec) throws IOException {
		
		thePrintWriter.println(rec.getDefline());
		thePrintWriter.println(rec.getSequence());
	}
}

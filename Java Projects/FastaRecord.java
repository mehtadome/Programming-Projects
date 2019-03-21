package dna;


public class FastaRecord implements DNARecord 
{	
	
	private String defline;
	private String sequence;
	
	// Constructor that initializes the 2 instance variables and throws RecordFormatException 
	// if the first char of defline is not the '>' char.
	public FastaRecord(String defline, String sequence) throws RecordFormatException {
		
		this.defline = defline;
		this.sequence = sequence;
		
		if(defline.charAt(0) != '>') {
			
			String err = "Unexpected " + defline.charAt(0) + " instead of '>'";
			throw new RecordFormatException(err);
		}
	}
	
	// Initializes defline and sequence from the input record. The defline is the
	// defline of the fastq record, but with a '>' in the first position rather than a '@'.
	public FastaRecord(FastqRecord fastqRec)
	{
		this.defline = ">" + fastqRec.getDefline().substring(1);
		this.sequence = fastqRec.getSequence();
	}	

	public String getDefline() {
		
		return this.defline;
	}
	
	public String getSequence() {
		
		return this.sequence;
	}
	
	// equals() method to check deep equality of 2 instance variables
	public boolean equals(Object far) {
		FastaRecord that = (FastaRecord)far;
		
		if(!this.defline.equals(that.defline) && !this.sequence.equals(that.sequence))
			return true;
		else
			return false;
	}
	
	
	// Returns the sum of the hashcodes of defline and sequence.
	public int hashCode() {
		
		return this.defline.hashCode() + this.sequence.hashCode();
	}
}

package dna;

//
// FastqRecord contains the defline, sequence, and quality string
// from a record in a fastq file.
//

public class FastqRecord implements DNARecord 
{
	
	private String defline;
	private String sequence;
	private String quality;
	
	// Constructor that initializes the 3 instance variables and throws RecordFormatException 
	// if the first char of defline is not the '@' char.
	public FastqRecord(String defline, String sequence, String quality) 
			throws RecordFormatException {
		
		this.defline = defline;
		this.sequence = sequence;
		this.quality = quality;
		
		// If defline doesn't start with correct character, throw an error
		if(defline.charAt(0) != '@') {
			
			String err = "Unexpected " + defline.charAt(0) + " instead of '@'";
			throw new RecordFormatException(err);
		}
	}
	
	// Method to satisfy the interface; returns instance variable of defline
	public String getDefline() {
		
		return this.defline;
	}

	// Method to satisfy the interface; returns instance variable of defline
	public String getSequence() {
		
		return this.sequence;
	}	

	// equals() method to check for deep equality of all 3 instance variables
	public boolean equals(Object fqr) {
		
		// Must have a cast
		FastqRecord that = (FastqRecord)fqr;
			
		// If all parameters are passed, return true. If not, return false.
		if(this.defline.equals(that.defline) && 
				this.sequence.equals(that.sequence) && 
					this.quality.equals(that.quality)) 
				return true;
		
		return false;
		}
	
	//qualityIsLow() method checks if the string quality contains at least 
	//one '!' char or at least one '#' char
	public boolean qualityIsLow()
	{		
		// If the array has at least one '!' or '#' char, return true; else, return false
		if((quality.contains("!")) || (quality.contains("#")))
			return true;
		else
			return false;
	}
	
	// Returns the sum of the hash codes of defline, sequence, and quality.
	public int hashCode()
	{
		return defline.hashCode() + sequence.hashCode() + quality.hashCode();
	}

}

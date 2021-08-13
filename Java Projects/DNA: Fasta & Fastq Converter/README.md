# This java app will read a fastq file and create a fasta file. 

## Problem Statement:
Patient care begins with extracting DNA from a tumor, and
determining its sequence using a machine that outputs a text file in “fastq” format.
Unfortunately it is not yet possible to determine the ACGT… sequence of entire DNA
molecules. The machine chops the molecule into lots of segments of a few hundred bases. We wish the fastq file could contain a single record with a
very long sequence. Instead, until some hard technical problems are solved, fastq files
contain thousands to millions of relatively short records.

In Bioinformatic Analysis, fastq files are commonly converted into fasta
format. A fasta file also has 1 record per read, but there are differences:
• Fasta files have only 2 lines per record: A defline and a sequence line.
• The defline starts with > rather than @.

The java app will read a fastq file and create a fasta file.
Records in the fastq might or might not meet some quality threshold, and might or might
not have unique deflines. Records in the fasta will all meet or exceed a quality threshold,
and will all have unique deflines.

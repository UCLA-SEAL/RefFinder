# RefFinder
Template-based Reconstruction of Complex Refactorings

[Website for Ref-Finder Tool Demo](https://sites.google.com/site/reffindertool/)

## Summary of RefFinder
RefFinder  identifies complex refactorings between two program versions using a template-based refactoring reconstruction approach---RefFinder expresses each refactoring type in terms of template logic rules and uses a logic programming engine to infer concrete refactoring instances. It currently supports sixty three refactoring types from Fowler's catalog, showing the most comprehensive coverage among existing techniques.

## Team
This project is developed by Professor [Miryung Kim](http://web.cs.ucla.edu/~miryung/)'s Software Engineering and Analysis Laboratory at UCLA. 
If you encounter any problems, please open an issue or feel free to contact us:

[Miryung Kim](http://web.cs.ucla.edu/~miryung/): Professor at UCLA, miryung@cs.ucla.edu;

## How to cite
Please refer to our ICSM '10 research paper, [Template-based Reconstruction of Complex Refactorings](http://web.cs.ucla.edu/~miryung/Publications/icsm10-reffinder.pdf) for more details.
### Bibtex  
```
@inproceedings{inproceedings,
	author = {Kim, Miryung and Gee, Matthew and Loh, Alex and Rachatasumrit, Napol},
	year = {2010},
	month = {01},
	pages = {371-372},
	title = {Ref-Finder: A refactoring reconstruction tool based on logic query templates},
	journal = {Proceedings of the ACM SIGSOFT Symposium on the Foundations of Software Engineering},
	doi = {10.1145/1882291.1882353}
}
```

## Usage
Tool Demo: [Ref-Finder: a Refactoring Reconstruction Tool based on Logic Query Templates, Miryung Kim, Matthew Gee, Alex Loh, and Napol Rachatasumrit, FSE' 10](http://web.cs.ucla.edu/~miryung/Publications/fse10-reffindertool.pdf)

Here is an example on how to use Ref-Finder jar file to identify refactorings. 

```
import edu.utexas.seal.reffinder.Application; ...
public class YourRefFinderView extends ViewPart {
  public void createPartControl(Composite p) {
    Application refFinder = new Application();
    try {
	refFinder.myStart(projOrig, projDelta, null);
	String xmlFilePath = projDelta.getLocation().toOSString()+System.getProperty("file.separator") +"RefList.xml";
	XmlReader xml = new XmlReader(xmlFilePath);
	//please refer to XmlReader and XMLOutput for more details
    } catch (Exception e1) {}
```


Step 1: Create your own Eclipse Plugin Project, import RefFinder_1.0.0.jar to classpath

Step 2: Create a Viewer and invoke myStart(IProject projectA, IProject projectB, String pathOutput)

Step 3: Parse the XML output from Ref-Finder.

## Extend Ref-Finder

You may want to start exploring from lsclipse/RefactoringQuery.java. Please check docs folder for syntax guide, etc.

## Dataset for ICSM'10

Please check inspect_dataset.

## Ref-Distiller
A extension of Ref-Finder that we are actively working on.

[Website for Ref-Distiller](https://sites.google.com/site/refdistiller/)

Manual refactoring edits are error prone, as refactoring requires developers to coordinate related transformations and understand the complex inter-relationship between affected files, variables, and methods. We propose RefDistiller, an approach for improving detection of manual refactoring anomalies by two combined strategies. First, it uses a predefined template to identify potential missed refactoring edits---omission anomalies. Second, it leverages an automated refactoring engine to separate behavior-preserving edits from behavior-modifying edits---commission anomalies. We evaluate its effectiveness on a data set with one hundred manual refactoring bugs. These bugs are hard to detect because they do not produce any compilation errors nor are caught by the pre- and post-condition checking of many existing refactoring engines. RefDistiller is able to identify 97% of the erroneous edits, of which 24% are not detected by the given test suites. 

Reference:
[Everton L. G. Alves , Myoungkyu Song , Miryung Kim, RefDistiller: a refactoring aware code review tool for inspecting manual refactoring edits, FSE'14](http://dl.acm.org/citation.cfm?id=2661674&CFID=717088503&CFTOKEN=96750876)

## LSDiff

Ref-Finder is built on LSDiff and we have open-sourced [LSDiff](https://github.com/UCLA-SEAL/lsdiff) and [LS-EclipsePlugin](https://github.com/UCLA-SEAL/LSDiff/tree/main/ls-eclipse)

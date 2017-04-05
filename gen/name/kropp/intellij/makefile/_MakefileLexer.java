/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package name.kropp.intellij.makefile;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static name.kropp.intellij.makefile.psi.MakefileTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>MakefileLexer.flex</tt>
 */
public class _MakefileLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int PREREQUISITES = 2;
  public static final int INCLUDES = 4;
  public static final int SOURCE = 6;
  public static final int DEFINE = 8;
  public static final int DEFINEBODY = 10;
  public static final int CONDITIONALS = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6, 6
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\14\1\1\2\0\1\4\22\0\1\2\1\12\1\0\1\5\1\15\3\0\1\16\1\17\1\0\1\13\1"+
    "\0\1\27\14\0\1\6\1\7\1\0\1\11\1\0\1\12\34\0\1\3\4\0\1\33\1\0\1\22\1\25\1\26"+
    "\1\36\1\0\1\35\1\20\2\0\1\23\1\0\1\21\1\40\1\32\1\37\1\41\1\30\1\34\1\24\1"+
    "\31\1\0\1\42\3\0\1\10\203\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\2\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\10\1\1\10\1\1\1\11\1\12\1\13\1\2"+
    "\4\1\1\6\1\14\1\15\1\2\1\6\1\2\1\16"+
    "\1\6\1\17\1\6\1\1\1\20\1\6\1\20\1\21"+
    "\1\2\1\3\1\22\1\23\13\1\2\24\1\25\4\1"+
    "\3\0\1\20\14\1\1\0\3\1\1\20\4\1\1\26"+
    "\3\1\1\27\10\1\1\20\2\1\1\30\1\31\2\1"+
    "\1\32\1\1\1\33\5\1\1\34\1\1\1\35\1\1"+
    "\1\36\1\37\2\1\1\40\2\1\1\41\1\1\1\42"+
    "\1\1\1\43\1\1\1\44\1\45\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\43\0\106\0\151\0\214\0\257\0\322\0\365"+
    "\0\u0118\0\u013b\0\u015e\0\u0181\0\u01a4\0\u01c7\0\u01ea\0\u020d"+
    "\0\u0230\0\u0253\0\u0276\0\u0299\0\u02bc\0\u02df\0\u0302\0\u0325"+
    "\0\u0348\0\u036b\0\u038e\0\365\0\365\0\u03b1\0\u03d4\0\u03f7"+
    "\0\u041a\0\u043d\0\u01a4\0\u0460\0\u0483\0\u04a6\0\u04c9\0\u04ec"+
    "\0\u050f\0\u0532\0\u01a4\0\u0555\0\u0578\0\u059b\0\u05be\0\u05e1"+
    "\0\u0604\0\u0627\0\u064a\0\u066d\0\u01c7\0\u0690\0\u06b3\0\u06d6"+
    "\0\u06f9\0\u071c\0\u073f\0\u0762\0\u0785\0\u07a8\0\u07cb\0\u07ee"+
    "\0\u01a4\0\u0811\0\u01c7\0\u0834\0\u0857\0\u087a\0\u089d\0\u0460"+
    "\0\u0555\0\u059b\0\u08c0\0\u08e3\0\u0906\0\u0929\0\u094c\0\u096f"+
    "\0\u0992\0\u09b5\0\u09d8\0\u09fb\0\u0a1e\0\u0a41\0\u0a64\0\u0a87"+
    "\0\u0aaa\0\u0acd\0\u0af0\0\u0b13\0\u0b36\0\u0b59\0\u0b7c\0\u0b9f"+
    "\0\365\0\u0bc2\0\u0be5\0\u0c08\0\365\0\u0c2b\0\u0c4e\0\u0c71"+
    "\0\u0c94\0\u01a4\0\u0cb7\0\u0cda\0\u0cfd\0\u0d20\0\u0d43\0\u0d66"+
    "\0\365\0\365\0\u0d89\0\u0dac\0\365\0\u0dcf\0\365\0\u0df2"+
    "\0\u0e15\0\u0e38\0\u0e5b\0\u0e7e\0\u059b\0\u0ea1\0\365\0\u0ec4"+
    "\0\365\0\365\0\u0ee7\0\u0f0a\0\365\0\u0f2d\0\u0f50\0\365"+
    "\0\u0f73\0\365\0\u0f96\0\365\0\u0fb9\0\365\0\365\0\365";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\10\1\11\1\12\1\10\1\11\1\13\1\14\2\10"+
    "\1\15\1\16\1\17\1\20\3\10\1\21\3\10\1\22"+
    "\1\23\1\24\2\25\1\26\1\27\5\10\1\30\3\10"+
    "\1\31\1\12\1\32\1\31\1\13\1\33\1\34\1\35"+
    "\1\15\1\16\1\17\1\36\1\37\10\10\1\40\3\10"+
    "\1\41\5\10\1\42\3\10\1\31\1\12\1\10\1\31"+
    "\1\13\1\43\2\10\2\43\1\10\1\36\26\10\1\44"+
    "\1\45\1\46\1\47\1\45\1\13\6\44\1\50\26\44"+
    "\1\10\1\51\1\12\1\10\1\51\1\13\1\52\2\10"+
    "\1\53\1\54\1\55\1\36\26\10\1\56\1\11\1\56"+
    "\1\57\1\11\1\13\20\56\1\60\14\56\1\61\1\45"+
    "\1\62\1\61\1\45\1\13\35\61\1\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\26\10\1\0\1\11"+
    "\2\0\1\11\40\0\1\12\40\0\1\63\1\0\2\63"+
    "\1\0\1\64\35\63\6\0\1\65\2\0\1\15\105\0"+
    "\1\15\31\0\1\10\2\0\1\10\3\0\2\10\1\15"+
    "\1\0\1\10\1\0\26\10\14\0\1\20\26\0\1\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\4\10"+
    "\1\66\14\10\1\67\5\10\2\0\1\10\3\0\2\10"+
    "\2\0\1\10\1\0\4\10\1\70\22\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\11\10\1\71\15\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\4\10"+
    "\1\72\1\10\1\73\16\10\1\74\1\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\3\10\1\75\23\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\15\10"+
    "\1\76\11\10\2\0\1\10\3\0\2\10\2\0\1\10"+
    "\1\0\24\10\1\77\2\10\2\0\1\10\3\0\2\10"+
    "\2\0\1\10\1\0\14\10\1\100\11\10\1\0\1\31"+
    "\2\0\1\31\36\0\1\10\1\101\1\0\1\10\1\102"+
    "\2\0\2\10\2\0\1\10\1\0\26\10\6\0\1\103"+
    "\2\0\1\15\45\0\1\36\26\0\1\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\1\10\1\104\25\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\25\10"+
    "\1\105\1\10\2\0\1\10\3\0\2\10\2\0\1\10"+
    "\1\0\24\10\1\106\2\10\2\0\1\10\3\0\2\10"+
    "\2\0\1\10\1\0\14\10\1\107\11\10\1\44\1\0"+
    "\1\44\1\110\1\0\36\44\1\0\1\45\2\0\1\45"+
    "\36\0\1\44\1\0\1\46\1\110\1\0\37\44\1\101"+
    "\1\44\1\110\1\102\37\44\1\0\1\44\1\110\1\0"+
    "\7\44\1\50\26\44\1\0\1\51\2\0\1\51\44\0"+
    "\1\111\2\0\1\53\42\0\1\53\31\0\1\10\2\0"+
    "\1\10\3\0\2\10\1\53\1\0\1\10\1\0\26\10"+
    "\1\56\1\0\1\56\1\112\1\0\37\56\1\101\1\56"+
    "\1\112\1\102\37\56\1\0\1\56\1\112\1\0\14\56"+
    "\1\113\21\56\1\61\1\0\2\61\2\0\36\61\1\0"+
    "\1\62\1\61\2\0\35\61\1\63\1\0\2\63\1\0"+
    "\36\63\1\64\1\0\2\64\1\0\36\64\1\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\5\10\1\114"+
    "\21\10\2\0\1\10\3\0\2\10\2\0\1\10\1\0"+
    "\4\10\1\115\3\10\1\116\1\117\15\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\10\10\1\120\16\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\21\10"+
    "\1\121\5\10\2\0\1\10\3\0\2\10\2\0\1\10"+
    "\1\0\10\10\1\122\16\10\2\0\1\10\3\0\2\10"+
    "\2\0\1\10\1\0\13\10\1\123\13\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\15\10\1\124\11\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\4\10"+
    "\1\66\22\10\2\0\1\10\3\0\2\10\2\0\1\10"+
    "\1\0\16\10\1\125\10\10\2\0\1\10\3\0\2\10"+
    "\2\0\1\10\1\0\3\10\1\126\23\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\11\10\1\127\14\10"+
    "\1\0\1\101\41\0\1\104\2\130\1\104\3\130\2\104"+
    "\2\130\1\104\1\130\2\104\1\10\23\104\1\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\15\10\1\131"+
    "\11\10\2\0\1\10\3\0\2\10\2\0\1\10\1\0"+
    "\3\10\1\132\23\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\11\10\1\133\14\10\1\56\1\0\1\56"+
    "\1\112\1\0\20\56\1\134\15\56\1\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\6\10\1\135\20\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\10\10"+
    "\1\136\1\137\15\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\11\10\1\140\15\10\2\0\1\10\3\0"+
    "\2\10\2\0\1\10\1\0\22\10\1\141\4\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\11\10\1\142"+
    "\15\10\2\0\1\10\3\0\2\10\2\0\1\10\1\0"+
    "\3\10\1\143\23\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\3\10\1\144\23\10\2\0\1\10\3\0"+
    "\2\10\2\0\1\10\1\0\11\10\1\145\15\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\23\10\1\146"+
    "\3\10\2\0\1\10\3\0\2\10\2\0\1\10\1\0"+
    "\17\10\1\147\7\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\14\10\1\150\12\10\2\0\1\10\3\0"+
    "\2\10\2\0\1\10\1\0\24\10\1\151\1\10\17\130"+
    "\1\152\23\130\1\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\23\10\1\153\3\10\2\0\1\10\3\0"+
    "\2\10\2\0\1\10\1\0\14\10\1\154\12\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\24\10\1\155"+
    "\1\10\1\56\1\0\1\56\1\112\1\0\21\56\1\156"+
    "\14\56\1\10\2\0\1\10\3\0\2\10\2\0\1\10"+
    "\1\0\7\10\1\157\17\10\2\0\1\10\3\0\2\10"+
    "\2\0\1\10\1\0\11\10\1\160\15\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\22\10\1\161\4\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\21\10"+
    "\1\162\5\10\2\0\1\10\3\0\2\10\2\0\1\10"+
    "\1\0\21\10\1\163\5\10\2\0\1\10\3\0\2\10"+
    "\2\0\1\10\1\0\4\10\1\164\22\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\21\10\1\165\5\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\24\10"+
    "\1\166\2\10\2\0\1\10\3\0\2\10\2\0\1\10"+
    "\1\0\20\10\1\167\6\10\2\0\1\10\3\0\2\10"+
    "\2\0\1\10\1\0\16\10\1\170\10\10\2\0\1\10"+
    "\3\0\2\10\2\0\1\10\1\0\24\10\1\171\2\10"+
    "\2\0\1\10\3\0\2\10\2\0\1\10\1\0\24\10"+
    "\1\172\2\10\2\0\1\10\3\0\2\10\2\0\1\10"+
    "\1\0\16\10\1\173\10\10\2\0\1\10\3\0\2\10"+
    "\2\0\1\10\1\0\24\10\1\174\1\10\1\56\1\0"+
    "\1\56\1\112\1\0\31\56\1\175\4\56\1\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\10\10\1\176"+
    "\16\10\2\0\1\10\3\0\2\10\2\0\1\10\1\0"+
    "\21\10\1\177\5\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\3\10\1\200\23\10\2\0\1\10\3\0"+
    "\2\10\2\0\1\10\1\0\11\10\1\201\15\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\17\10\1\202"+
    "\7\10\2\0\1\10\3\0\2\10\2\0\1\10\1\0"+
    "\17\10\1\203\7\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\3\10\1\204\23\10\2\0\1\10\3\0"+
    "\2\10\2\0\1\10\1\0\17\10\1\205\7\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\17\10\1\206"+
    "\7\10\2\0\1\10\3\0\2\10\2\0\1\10\1\0"+
    "\3\10\1\207\23\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\11\10\1\210\15\10\2\0\1\10\3\0"+
    "\2\10\2\0\1\10\1\0\4\10\1\211\22\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\11\10\1\212"+
    "\15\10\2\0\1\10\3\0\2\10\2\0\1\10\1\0"+
    "\10\10\1\213\16\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\11\10\1\214\15\10\2\0\1\10\3\0"+
    "\2\10\2\0\1\10\1\0\10\10\1\215\16\10\2\0"+
    "\1\10\3\0\2\10\2\0\1\10\1\0\11\10\1\216"+
    "\15\10\2\0\1\10\3\0\2\10\2\0\1\10\1\0"+
    "\11\10\1\217\15\10\2\0\1\10\3\0\2\10\2\0"+
    "\1\10\1\0\11\10\1\220\14\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4060];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\5\1\1\11\25\1\1\11\7\1\1\11\25\1"+
    "\1\11\6\1\3\0\15\1\1\0\21\1\1\11\46\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _MakefileLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MakefileLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        switch (zzLexicalState) {
            case PREREQUISITES: {
              yypushback(yylength()); yybegin(YYINITIAL); return EOL;
            }
            case 145: break;
            case INCLUDES: {
              yypushback(yylength()); yybegin(YYINITIAL); return EOL;
            }
            case 146: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return IDENTIFIER;
            }
          case 39: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 40: break;
          case 3: 
            { return COMMENT;
            }
          case 41: break;
          case 4: 
            { yybegin(PREREQUISITES); return COLON;
            }
          case 42: break;
          case 5: 
            { yybegin(SOURCE); return ASSIGN;
            }
          case 43: break;
          case 6: 
            { return BAD_CHARACTER;
            }
          case 44: break;
          case 7: 
            { yybegin(SOURCE); return TAB;
            }
          case 45: break;
          case 8: 
            { yybegin(YYINITIAL); return EOL;
            }
          case 46: break;
          case 9: 
            { return COLON;
            }
          case 47: break;
          case 10: 
            { yybegin(SOURCE); return SEMICOLON;
            }
          case 48: break;
          case 11: 
            { return PIPE;
            }
          case 49: break;
          case 12: 
            { return LINE;
            }
          case 50: break;
          case 13: 
            { yybegin(YYINITIAL); return WHITE_SPACE;
            }
          case 51: break;
          case 14: 
            { yybegin(DEFINEBODY); return WHITE_SPACE;
            }
          case 52: break;
          case 15: 
            { return ASSIGN;
            }
          case 53: break;
          case 16: 
            { return VARIABLE_VALUE_LINE;
            }
          case 54: break;
          case 17: 
            { yybegin(YYINITIAL); return CONDITION;
            }
          case 55: break;
          case 18: 
            { return DOC_COMMENT;
            }
          case 56: break;
          case 19: 
            { yybegin(PREREQUISITES); return DOUBLECOLON;
            }
          case 57: break;
          case 20: 
            { return SPLIT;
            }
          case 58: break;
          case 21: 
            { return DOUBLECOLON;
            }
          case 59: break;
          case 22: 
            { yybegin(CONDITIONALS); return KEYWORD_IFEQ;
            }
          case 60: break;
          case 23: 
            { return KEYWORD_ELSE;
            }
          case 61: break;
          case 24: 
            { yybegin(CONDITIONALS); return KEYWORD_IFNEQ;
            }
          case 62: break;
          case 25: 
            { yybegin(CONDITIONALS); return KEYWORD_IFDEF;
            }
          case 63: break;
          case 26: 
            { return KEYWORD_ENDIF;
            }
          case 64: break;
          case 27: 
            { yybegin(INCLUDES); return KEYWORD_VPATH;
            }
          case 65: break;
          case 28: 
            { yybegin(YYINITIAL); return KEYWORD_ENDEF;
            }
          case 66: break;
          case 29: 
            { yybegin(CONDITIONALS); return KEYWORD_IFNDEF;
            }
          case 67: break;
          case 30: 
            { yybegin(DEFINE); return KEYWORD_DEFINE;
            }
          case 68: break;
          case 31: 
            { return KEYWORD_EXPORT;
            }
          case 69: break;
          case 32: 
            { yybegin(YYINITIAL); return KEYWORD_EXPORT;
            }
          case 70: break;
          case 33: 
            { yybegin(INCLUDES); return KEYWORD_INCLUDE;
            }
          case 71: break;
          case 34: 
            { return KEYWORD_PRIVATE;
            }
          case 72: break;
          case 35: 
            { yybegin(YYINITIAL); return KEYWORD_PRIVATE;
            }
          case 73: break;
          case 36: 
            { yybegin(INCLUDES); return KEYWORD_UNDEFINE;
            }
          case 74: break;
          case 37: 
            { return KEYWORD_OVERRIDE;
            }
          case 75: break;
          case 38: 
            { yybegin(YYINITIAL); return KEYWORD_OVERRIDE;
            }
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

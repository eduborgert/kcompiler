package modal;

/* Generated By:JavaCC: Do not edit this line. ParserConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int DO = 10;
  /** RegularExpression Id. */
  int THIS = 11;
  /** RegularExpression Id. */
  int BODY = 12;
  /** RegularExpression Id. */
  int DESCRIPTION = 13;
  /** RegularExpression Id. */
  int DECLARATION = 14;
  /** RegularExpression Id. */
  int TYPE = 15;
  /** RegularExpression Id. */
  int IS = 16;
  /** RegularExpression Id. */
  int AS = 17;
  /** RegularExpression Id. */
  int CONSTANT = 18;
  /** RegularExpression Id. */
  int VARIABLE = 19;
  /** RegularExpression Id. */
  int AND = 20;
  /** RegularExpression Id. */
  int INTEGER = 21;
  /** RegularExpression Id. */
  int REAL = 22;
  /** RegularExpression Id. */
  int STRING = 23;
  /** RegularExpression Id. */
  int LOGIC = 24;
  /** RegularExpression Id. */
  int DESIGNATE = 25;
  /** RegularExpression Id. */
  int READ = 26;
  /** RegularExpression Id. */
  int WRITE = 27;
  /** RegularExpression Id. */
  int ALL = 28;
  /** RegularExpression Id. */
  int AVALIATE = 29;
  /** RegularExpression Id. */
  int TRUE = 30;
  /** RegularExpression Id. */
  int UNTRUE = 31;
  /** RegularExpression Id. */
  int RESULT = 32;
  /** RegularExpression Id. */
  int REPEAT = 33;
  /** RegularExpression Id. */
  int OPEN_BRACKET = 34;
  /** RegularExpression Id. */
  int CLOSE_BRACKET = 35;
  /** RegularExpression Id. */
  int OPEN_PARENTHESIS = 36;
  /** RegularExpression Id. */
  int CLOSE_PARENTHESIS = 37;
  /** RegularExpression Id. */
  int EQUAL = 38;
  /** RegularExpression Id. */
  int DOT = 39;
  /** RegularExpression Id. */
  int COMMA = 40;
  /** RegularExpression Id. */
  int PLUS = 41;
  /** RegularExpression Id. */
  int MINUS = 42;
  /** RegularExpression Id. */
  int MULTIPLY = 43;
  /** RegularExpression Id. */
  int DIVIDER = 44;
  /** RegularExpression Id. */
  int POW = 45;
  /** RegularExpression Id. */
  int PERCENT = 46;
  /** RegularExpression Id. */
  int MOD = 47;
  /** RegularExpression Id. */
  int EQUALS = 48;
  /** RegularExpression Id. */
  int DIFFERENT = 49;
  /** RegularExpression Id. */
  int LESS = 50;
  /** RegularExpression Id. */
  int GREATER = 51;
  /** RegularExpression Id. */
  int LESS_EQUAL = 52;
  /** RegularExpression Id. */
  int GREATER_EQUAL = 53;
  /** RegularExpression Id. */
  int AMPERSAND = 54;
  /** RegularExpression Id. */
  int PIPE = 55;
  /** RegularExpression Id. */
  int EXCLAMATION = 56;
  /** RegularExpression Id. */
  int DIGIT = 57;
  /** RegularExpression Id. */
  int DECIMAL_NUMBER = 58;
  /** RegularExpression Id. */
  int NUMBER_INTEGER = 59;
  /** RegularExpression Id. */
  int NUMBER_REAL = 60;
  /** RegularExpression Id. */
  int LITERAL_CONSTANT = 61;
  /** RegularExpression Id. */
  int UPPER_CASE = 62;
  /** RegularExpression Id. */
  int LOWER_CASE = 63;
  /** RegularExpression Id. */
  int LETTER = 64;
  /** RegularExpression Id. */
  int UNDERLINE = 65;
  /** RegularExpression Id. */
  int IDENTIFIER = 66;
  /** RegularExpression Id. */
  int INEQUALITY_MINUS = 67;
  /** RegularExpression Id. */
  int INEQUALITY_PLUS = 68;
  /** RegularExpression Id. */
  int INVALID_SIMBOLS = 69;
  /** RegularExpression Id. */
  int INVALID_ARITHMETIC_OPERATOR = 70;
  /** RegularExpression Id. */
  int INVALID_RELATIONAL_OPERATOR = 71;
  /** RegularExpression Id. */
  int INVALI_LOGICAL_OPERATOR = 72;
  /** RegularExpression Id. */
  int INVALID_INTEGER_NUMBER = 73;
  /** RegularExpression Id. */
  int INVALID_REAL_NUMBER = 74;
  /** RegularExpression Id. */
  int INVALID_LITERAL_CONSTANT = 75;
  /** RegularExpression Id. */
  int INVALID_IDENTIFIER = 76;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int commentmultiline = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 9>",
    "\"do\"",
    "\"this\"",
    "\"body\"",
    "\"description\"",
    "\"declaration\"",
    "\"type\"",
    "\"is\"",
    "\"as\"",
    "\"constant\"",
    "\"variable\"",
    "\"and\"",
    "\"integer\"",
    "\"real\"",
    "\"string\"",
    "\"logic\"",
    "\"designate\"",
    "\"read\"",
    "\"write\"",
    "\"all\"",
    "\"avaliate\"",
    "\"true\"",
    "\"untrue\"",
    "\"result\"",
    "\"repeat\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\"=\"",
    "\".\"",
    "\",\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"**\"",
    "\"%\"",
    "\"%%\"",
    "\"==\"",
    "\"!=\"",
    "\"<<\"",
    "\">>\"",
    "\"<<=\"",
    "\">>=\"",
    "\"&\"",
    "\"|\"",
    "\"!\"",
    "<DIGIT>",
    "<DECIMAL_NUMBER>",
    "<NUMBER_INTEGER>",
    "<NUMBER_REAL>",
    "<LITERAL_CONSTANT>",
    "<UPPER_CASE>",
    "<LOWER_CASE>",
    "<LETTER>",
    "<UNDERLINE>",
    "<IDENTIFIER>",
    "<INEQUALITY_MINUS>",
    "<INEQUALITY_PLUS>",
    "<INVALID_SIMBOLS>",
    "<INVALID_ARITHMETIC_OPERATOR>",
    "<INVALID_RELATIONAL_OPERATOR>",
    "<INVALI_LOGICAL_OPERATOR>",
    "<INVALID_INTEGER_NUMBER>",
    "<INVALID_REAL_NUMBER>",
    "<INVALID_LITERAL_CONSTANT>",
    "<INVALID_IDENTIFIER>",
  };

}

File touchFile = new File( basedir, "target/classes/antora.yml" );
String expected = "version: 1.0.0" + System.lineSeparator() + "prerelease: -SNAPSHOT";
assert touchFile.isFile()
assert touchFile.text == expected;
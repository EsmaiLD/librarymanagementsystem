import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.io.File file0 = null;
        java.net.URL uRL1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(file0, uRL1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: File must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = org.springframework.boot.loader.PropertiesLauncher.PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loader.path" + "'", str0, "loader.path");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest2 = jarFileArchive1.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.jar.JarFile jarFile1 = new org.springframework.boot.loader.jar.JarFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: File must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = java.util.zip.ZipFile.OPEN_READ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders("loader.path");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "loader.path" + "'", str1, "loader.path");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.springframework.boot.loader.util.SystemPropertyUtils.PLACEHOLDER_SUFFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "}" + "'", str0, "}");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.springframework.boot.loader.jar.JarFile.registerUrlProtocolHandler();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Runtime.Version version0 = java.util.jar.JarFile.baseVersion();
        org.junit.Assert.assertNotNull(version0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        // The following exception was thrown during execution in test generation
        try {
            jarFileArchive1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.close()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter2 = null;
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive> archiveItor4 = jarFileArchive1.getNestedArchives(entryFilter2, entryFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = org.springframework.boot.loader.PropertiesLauncher.CONFIG_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loader.config.name" + "'", str0, "loader.config.name");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.InputStream inputStream1 = java.lang.ClassLoader.getSystemResourceAsStream("loader.path");
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str0 = org.springframework.boot.loader.PropertiesLauncher.MAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loader.main" + "'", str0, "loader.main");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = org.springframework.boot.loader.util.SystemPropertyUtils.VALUE_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor2 = jarFileArchive1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest2 = jarFileArchive1.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = new org.springframework.boot.loader.archive.ExplodedArchive(file0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.exists()\" because \"root\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str3 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("loader.path", ":", "}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":" + "'", str3, ":");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator2 = jarFileArchive1.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str0 = org.springframework.boot.loader.PropertiesLauncher.HOME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loader.home" + "'", str0, "loader.home");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.boot.loader.archive.Archive> archiveList3 = jarFileArchive1.getNestedArchives(entryFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected call to getNestedArchives(filter)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = jarFileArchive1.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter2 = null;
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive> archiveItor4 = jarFileArchive1.getNestedArchives(entryFilter2, entryFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor2 = jarFileArchive1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner2 = new org.springframework.boot.loader.MainMethodRunner("}", strArray1);
        // The following exception was thrown during execution in test generation
        try {
            mainMethodRunner2.run();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: }");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.springframework.boot.loader.jar.Handler.setUseFastConnectionExceptions(true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.springframework.boot.loader.JarLauncher jarLauncher0 = new org.springframework.boot.loader.JarLauncher();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.net.URL uRL0 = null;
        java.net.URL[] uRLArray1 = new java.net.URL[] { uRL0 };
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str0 = org.springframework.boot.loader.PropertiesLauncher.SET_SYSTEM_PROPERTIES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loader.system" + "'", str0, "loader.system");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.jar.Handler handler1 = new org.springframework.boot.loader.jar.Handler(jarFile0);
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.jar.JarFile jarFile3 = handler1.getRootJarFileFromUrl(uRL2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.getFile()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int0 = java.util.zip.ZipFile.OPEN_DELETE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.springframework.boot.loader.PropertiesLauncher propertiesLauncher0 = new org.springframework.boot.loader.PropertiesLauncher();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.springframework.boot.loader.jar.Handler.setUseFastConnectionExceptions(false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = jarFileArchive1.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str0 = org.springframework.boot.loader.PropertiesLauncher.CONFIG_LOCATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loader.config.location" + "'", str0, "loader.config.location");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Runtime.Version version0 = java.util.jar.JarFile.runtimeVersion();
        org.junit.Assert.assertNotNull(version0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = new org.springframework.boot.loader.archive.ExplodedArchive(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.exists()\" because \"root\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        java.net.URL uRL3 = null;
        java.net.URL[] uRLArray4 = new java.net.URL[] { uRL3 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader6 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.data.RandomAccessDataFile randomAccessDataFile1 = new org.springframework.boot.loader.data.RandomAccessDataFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: File must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.net.URL uRL0 = null;
        java.net.URL[] uRLArray1 = new java.net.URL[] { uRL0 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Properties properties0 = null;
        java.lang.String str2 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders(properties0, "loader.system");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "loader.system" + "'", str2, "loader.system");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.net.URL uRL0 = null;
        java.net.URL[] uRLArray1 = new java.net.URL[] { uRL0 };
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader3 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str0 = org.springframework.boot.loader.util.SystemPropertyUtils.PLACEHOLDER_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "${" + "'", str0, "${");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Properties properties0 = null;
        java.lang.String str2 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders(properties0, "loader.config.name");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "loader.config.name" + "'", str2, "loader.config.name");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        // The following exception was thrown during execution in test generation
        try {
            jarFileArchive1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.close()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.Enumeration<java.net.URL> uRLEnumeration1 = java.lang.ClassLoader.getSystemResources("loader.home");
        org.junit.Assert.assertNotNull(uRLEnumeration1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("loader.path");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.lang.ClassLoader classLoader2 = uRLClassLoader1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = classLoader2.loadClass("loader.path");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: loader.path");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.InputStream inputStream1 = java.lang.ClassLoader.getSystemResourceAsStream("}");
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.springframework.boot.loader.WarLauncher warLauncher0 = new org.springframework.boot.loader.WarLauncher();
        org.springframework.boot.loader.archive.Archive.Entry entry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = warLauncher0.isNestedArchive(entry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.archive.Archive$Entry.isDirectory()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor3 = jarFileArchive1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor3 = jarFileArchive1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest3 = jarFileArchive1.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str1 = org.springframework.boot.loader.PropertiesLauncher.toCamelCase((java.lang.CharSequence) "loader.path");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loader.Path" + "'", str1, "Loader.Path");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = jarFileArchive1.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor12 = jarFileArchive2.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("${");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest12 = jarFileArchive2.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.boot.loader.archive.Archive> archiveList4 = jarFileArchive1.getNestedArchives(entryFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected call to getNestedArchives(filter)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.net.URL[] uRLArray1 = null;
        java.net.URL[] uRLArray2 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray2);
        java.lang.ClassLoader classLoader4 = uRLClassLoader3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader5 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray1, (java.lang.ClassLoader) uRLClassLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"urls\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
        org.junit.Assert.assertNotNull(classLoader4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator12 = jarFileArchive2.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray12 = uRLClassLoader6.getURLs();
        java.lang.String str13 = uRLClassLoader6.getName();
        uRLClassLoader6.setClassAssertionStatus("loader.system", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty(":");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL12 = jarFileArchive2.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("loader.config.name");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.lang.ClassLoader classLoader2 = uRLClassLoader1.getParent();
        java.net.URL uRL4 = classLoader2.getResource("hi!");
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = jarFileArchive1.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Enumeration<java.net.URL> uRLEnumeration1 = java.lang.ClassLoader.getSystemResources("Loader.Path");
        org.junit.Assert.assertNotNull(uRLEnumeration1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.net.URL uRL3 = uRLClassLoader1.getResource("}");
        uRLClassLoader1.clearAssertionStatus();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNull(uRL3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest12 = jarFileArchive2.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str1 = org.springframework.boot.loader.PropertiesLauncher.toCamelCase((java.lang.CharSequence) "loader.config.name");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loader.Config.Name" + "'", str1, "Loader.Config.Name");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URL[] uRLArray3 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader4 = java.net.URLClassLoader.newInstance(uRLArray3);
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader6 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray3, classLoader5);
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        uRLClassLoader8.clearAssertionStatus();
        java.net.URL[] uRLArray10 = uRLClassLoader8.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray3, (java.lang.ClassLoader) uRLClassLoader8);
        java.net.URLClassLoader uRLClassLoader12 = java.net.URLClassLoader.newInstance(uRLArray0, (java.lang.ClassLoader) launchedURLClassLoader11);
        launchedURLClassLoader11.setDefaultAssertionStatus(true);
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLClassLoader4);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLClassLoader12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        uRLClassLoader1.setPackageAssertionStatus("loader.config.location", false);
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str1 = org.springframework.boot.loader.PropertiesLauncher.toCamelCase((java.lang.CharSequence) "loader.home");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loader.Home" + "'", str1, "Loader.Home");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("loader.main");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String[] strArray6 = new java.lang.String[] { ":", "hi!", "loader.path", "}", "hi!" };
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner7 = new org.springframework.boot.loader.MainMethodRunner("hi!", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            mainMethodRunner7.run();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter3 = null;
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive> archiveItor5 = jarFileArchive1.getNestedArchives(entryFilter3, entryFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("Loader.Config.Name");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Enumeration<java.net.URL> uRLEnumeration1 = java.lang.ClassLoader.getSystemResources("loader.config.location");
        org.junit.Assert.assertNotNull(uRLEnumeration1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("loader.config.location");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders("}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URL[] uRLArray3 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader4 = java.net.URLClassLoader.newInstance(uRLArray3);
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader6 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray3, classLoader5);
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        uRLClassLoader8.clearAssertionStatus();
        java.net.URL[] uRLArray10 = uRLClassLoader8.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray3, (java.lang.ClassLoader) uRLClassLoader8);
        java.net.URLClassLoader uRLClassLoader12 = java.net.URLClassLoader.newInstance(uRLArray0, (java.lang.ClassLoader) launchedURLClassLoader11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = uRLClassLoader12.loadClass("}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: }");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLClassLoader4);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLClassLoader12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.lang.ClassLoader classLoader2 = uRLClassLoader1.getParent();
        classLoader2.setClassAssertionStatus("", true);
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile15 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive16 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile15);
        boolean boolean17 = jarFileArchive16.isExploded();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URL[] uRLArray19 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray19);
        java.net.URL uRL22 = uRLClassLoader20.getResource("}");
        java.net.URL uRL24 = uRLClassLoader20.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive16, uRLArray18, (java.lang.ClassLoader) uRLClassLoader20);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader26 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray13, (java.lang.ClassLoader) uRLClassLoader20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = launchedURLClassLoader26.loadClass("${");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ${");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLArray19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNull(uRL22);
// flaky:         org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        // The following exception was thrown during execution in test generation
        try {
            jarFileArchive2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.close()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str0 = org.springframework.boot.loader.PropertiesLauncher.ARGS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loader.args" + "'", str0, "loader.args");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str1 = org.springframework.boot.loader.PropertiesLauncher.toCamelCase((java.lang.CharSequence) "Loader.Path");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loader.Path" + "'", str1, "Loader.Path");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.lang.ClassLoader classLoader6 = uRLClassLoader5.getParent();
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        java.lang.Module module8 = uRLClassLoader7.getUnnamedModule();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNotNull(module8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str1 = org.springframework.boot.loader.PropertiesLauncher.toCamelCase((java.lang.CharSequence) "Loader.Home");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loader.Home" + "'", str1, "Loader.Home");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.toURI()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.net.URL uRL7 = uRLClassLoader5.getResource("}");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader8 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        java.lang.String str9 = launchedURLClassLoader8.getName();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.lang.ClassLoader classLoader2 = java.lang.ClassLoader.getPlatformClassLoader();
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray0, classLoader2);
        uRLClassLoader3.setDefaultAssertionStatus(true);
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile15 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive16 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile15);
        boolean boolean17 = jarFileArchive16.isExploded();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URL[] uRLArray19 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray19);
        java.net.URL uRL22 = uRLClassLoader20.getResource("}");
        java.net.URL uRL24 = uRLClassLoader20.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive16, uRLArray18, (java.lang.ClassLoader) uRLClassLoader20);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader26 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray13, (java.lang.ClassLoader) uRLClassLoader20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor27 = jarFileArchive3.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLArray19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNull(uRL22);
// flaky:         org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader4 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray1, classLoader3);
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        uRLClassLoader6.clearAssertionStatus();
        java.net.URL[] uRLArray8 = uRLClassLoader6.getURLs();
        java.lang.ClassLoader classLoader9 = uRLClassLoader6.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader10 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray1, classLoader9);
        java.lang.Package package12 = classLoader9.getDefinedPackage("Loader.Home");
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(package12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Properties properties0 = null;
        java.lang.String str2 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders(properties0, "loader.config.location");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "loader.config.location" + "'", str2, "loader.config.location");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.springframework.boot.loader.jar.Handler handler0 = new org.springframework.boot.loader.jar.Handler();
        java.net.URL uRL1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.jar.JarFile jarFile2 = handler0.getRootJarFileFromUrl(uRL1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.getFile()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.lang.ClassLoader classLoader4 = uRLClassLoader1.getParent();
        java.lang.String str5 = classLoader4.getName();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "app" + "'", str5, "app");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile15 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive16 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile15);
        boolean boolean17 = jarFileArchive16.isExploded();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URL[] uRLArray19 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray19);
        java.net.URL uRL22 = uRLClassLoader20.getResource("}");
        java.net.URL uRL24 = uRLClassLoader20.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive16, uRLArray18, (java.lang.ClassLoader) uRLClassLoader20);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader26 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray13, (java.lang.ClassLoader) uRLClassLoader20);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL27 = jarFileArchive3.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLArray19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNull(uRL22);
// flaky:         org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.util.Enumeration<java.net.URL> uRLEnumeration13 = launchedURLClassLoader11.findResources("loader.home");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = launchedURLClassLoader11.loadClass("${");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ${");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLEnumeration13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String[] strArray7 = new java.lang.String[] { ":", "hi!", "loader.path", "}", "hi!" };
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner8 = new org.springframework.boot.loader.MainMethodRunner("hi!", strArray7);
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner9 = new org.springframework.boot.loader.MainMethodRunner("loader.path", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile15 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive16 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile15);
        boolean boolean17 = jarFileArchive16.isExploded();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URL[] uRLArray19 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray19);
        java.net.URL uRL22 = uRLClassLoader20.getResource("}");
        java.net.URL uRL24 = uRLClassLoader20.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive16, uRLArray18, (java.lang.ClassLoader) uRLClassLoader20);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader26 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray13, (java.lang.ClassLoader) uRLClassLoader20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator27 = jarFileArchive3.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLArray19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNull(uRL22);
// flaky:         org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String str3 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("Loader.Config.Name", "loader.args", "loader.system");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "loader.args" + "'", str3, "loader.args");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.lang.ClassLoader classLoader4 = uRLClassLoader1.getParent();
        java.util.stream.Stream<java.net.URL> uRLStream6 = uRLClassLoader1.resources("loader.path");
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(uRLStream6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.net.URL uRL3 = uRLClassLoader1.getResource("}");
        java.net.URL uRL5 = uRLClassLoader1.getResource("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = uRLClassLoader1.loadClass("app");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: app");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNull(uRL3);
// flaky:         org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.net.URL uRL3 = uRLClassLoader1.getResource("}");
        java.lang.Package[] packageArray4 = uRLClassLoader1.getDefinedPackages();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(packageArray4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.net.URL uRL7 = uRLClassLoader5.getResource("}");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader8 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = launchedURLClassLoader8.loadClass("app");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: app");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.lang.ClassLoader classLoader2 = uRLClassLoader1.getParent();
        java.util.stream.Stream<java.net.URL> uRLStream4 = uRLClassLoader1.resources("");
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(uRLStream4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.lang.ClassLoader classLoader6 = uRLClassLoader5.getParent();
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        java.lang.Package[] packageArray8 = uRLClassLoader5.getDefinedPackages();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNotNull(packageArray8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String str3 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty(":", "loader.home", "}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "loader.home" + "'", str3, "loader.home");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.Package package13 = launchedURLClassLoader11.getDefinedPackage("jar archive");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(package13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Enumeration<java.net.URL> uRLEnumeration1 = java.lang.ClassLoader.getSystemResources("loader.main");
        org.junit.Assert.assertNotNull(uRLEnumeration1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        uRLClassLoader2.clearAssertionStatus();
        java.net.URL[] uRLArray4 = uRLClassLoader2.getURLs();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.util.Enumeration<java.net.URL> uRLEnumeration13 = uRLClassLoader6.getResources("loader.main");
        java.lang.Package[] packageArray14 = uRLClassLoader6.getDefinedPackages();
        java.lang.Package package16 = uRLClassLoader6.getDefinedPackage("Loader.Home");
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLEnumeration13);
        org.junit.Assert.assertNotNull(packageArray14);
        org.junit.Assert.assertNull(package16);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.String str12 = jarFileArchive2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator13 = jarFileArchive2.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jar archive" + "'", str12, "jar archive");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.lang.Class<?> wildcardClass4 = uRLArray3.getClass();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.net.URL[] uRLArray2 = uRLClassLoader1.getURLs();
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray2);
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("jar archive");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL12 = jarFileArchive2.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray12 = uRLClassLoader6.getURLs();
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = uRLClassLoader14.getParent();
        java.lang.Module module16 = classLoader15.getUnnamedModule();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader17 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray12, classLoader15);
        java.net.URL uRL19 = launchedURLClassLoader17.findResource("Loader.Path");
        java.lang.Package[] packageArray20 = launchedURLClassLoader17.getDefinedPackages();
        java.lang.Package package22 = launchedURLClassLoader17.getDefinedPackage("jar archive");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(module16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(packageArray20);
        org.junit.Assert.assertNull(package22);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.Module module12 = launchedURLClassLoader11.getUnnamedModule();
        java.util.Enumeration<java.net.URL> uRLEnumeration14 = launchedURLClassLoader11.findResources("Loader.Path");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(module12);
        org.junit.Assert.assertNotNull(uRLEnumeration14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("loader.main");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.String str12 = jarFileArchive2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL13 = jarFileArchive2.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jar archive" + "'", str12, "jar archive");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader4 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray1, classLoader3);
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        uRLClassLoader6.clearAssertionStatus();
        java.net.URL[] uRLArray8 = uRLClassLoader6.getURLs();
        java.lang.ClassLoader classLoader9 = uRLClassLoader6.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader10 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray1, classLoader9);
        java.net.URL[] uRLArray11 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader12 = java.net.URLClassLoader.newInstance(uRLArray11);
        java.lang.ClassLoader classLoader13 = uRLClassLoader12.getParent();
        java.lang.Module module14 = classLoader13.getUnnamedModule();
        java.net.URLClassLoader uRLClassLoader15 = java.net.URLClassLoader.newInstance(uRLArray1, classLoader13);
        uRLClassLoader15.setClassAssertionStatus("loader.args", false);
        uRLClassLoader15.close();
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(uRLArray11);
        org.junit.Assert.assertNotNull(uRLClassLoader12);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(module14);
        org.junit.Assert.assertNotNull(uRLClassLoader15);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("loader.args");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String[] strArray7 = new java.lang.String[] { ":", "hi!", "loader.path", "}", "hi!" };
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner8 = new org.springframework.boot.loader.MainMethodRunner("hi!", strArray7);
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner9 = new org.springframework.boot.loader.MainMethodRunner("", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            mainMethodRunner9.run();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URL[] uRLArray3 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader4 = java.net.URLClassLoader.newInstance(uRLArray3);
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader6 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray3, classLoader5);
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        uRLClassLoader8.clearAssertionStatus();
        java.net.URL[] uRLArray10 = uRLClassLoader8.getURLs();
        java.lang.ClassLoader classLoader11 = uRLClassLoader8.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray3, classLoader11);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader13 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray1, (java.lang.ClassLoader) launchedURLClassLoader12);
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLClassLoader4);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            jarFileArchive1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.close()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.Module module12 = launchedURLClassLoader11.getUnnamedModule();
        java.util.stream.Stream<java.net.URL> uRLStream14 = launchedURLClassLoader11.resources("}");
        launchedURLClassLoader11.clearAssertionStatus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(module12);
        org.junit.Assert.assertNotNull(uRLStream14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.InputStream inputStream1 = java.lang.ClassLoader.getSystemResourceAsStream("loader.args");
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        uRLClassLoader5.clearAssertionStatus();
        java.net.URL[] uRLArray7 = uRLClassLoader5.getURLs();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = uRLClassLoader9.getParent();
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray7, (java.lang.ClassLoader) uRLClassLoader9);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray13, classLoader15);
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        uRLClassLoader18.clearAssertionStatus();
        java.net.URL[] uRLArray20 = uRLClassLoader18.getURLs();
        java.lang.ClassLoader classLoader21 = uRLClassLoader18.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray13, classLoader21);
        java.net.URL uRL24 = launchedURLClassLoader22.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream26 = launchedURLClassLoader22.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader27 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray7, (java.lang.ClassLoader) launchedURLClassLoader22);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL28 = jarFileArchive2.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(classLoader21);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLStream26);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.net.URL uRL7 = uRLClassLoader5.getResource("}");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader8 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        java.lang.ClassLoader classLoader9 = uRLClassLoader5.getParent();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(classLoader9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray14 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader15 = java.net.URLClassLoader.newInstance(uRLArray14);
        uRLClassLoader15.clearAssertionStatus();
        java.net.URL[] uRLArray17 = uRLClassLoader15.getURLs();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader19 = java.net.URLClassLoader.newInstance(uRLArray18);
        java.net.URL uRL21 = uRLClassLoader19.getResource("}");
        java.net.URL uRL23 = uRLClassLoader19.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader24 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray17, (java.lang.ClassLoader) uRLClassLoader19);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray5, (java.lang.ClassLoader) launchedURLClassLoader24);
        java.lang.Package package27 = launchedURLClassLoader25.getDefinedPackage("Loader.Home");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray14);
        org.junit.Assert.assertNotNull(uRLClassLoader15);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLClassLoader19);
        org.junit.Assert.assertNull(uRL21);
// flaky:         org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(package27);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String str3 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("loader.system", "hi!", "jar archive");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "${" };
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner5 = new org.springframework.boot.loader.MainMethodRunner("jar archive", strArray4);
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner6 = new org.springframework.boot.loader.MainMethodRunner("hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray12 = uRLClassLoader6.getURLs();
        java.net.URL[] uRLArray13 = uRLClassLoader6.getURLs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = uRLClassLoader6.loadClass("loader.path");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: loader.path");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLArray13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        boolean boolean3 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = jarFileArchive1.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile15 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive16 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile15);
        boolean boolean17 = jarFileArchive16.isExploded();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URL[] uRLArray19 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray19);
        java.net.URL uRL22 = uRLClassLoader20.getResource("}");
        java.net.URL uRL24 = uRLClassLoader20.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive16, uRLArray18, (java.lang.ClassLoader) uRLClassLoader20);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader26 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray13, (java.lang.ClassLoader) uRLClassLoader20);
        java.net.URLClassLoader uRLClassLoader27 = java.net.URLClassLoader.newInstance(uRLArray13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLArray19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNull(uRL22);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLClassLoader27);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        uRLClassLoader14.clearAssertionStatus();
        java.net.URL[] uRLArray16 = uRLClassLoader14.getURLs();
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        java.lang.ClassLoader classLoader19 = uRLClassLoader18.getParent();
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray16, (java.lang.ClassLoader) uRLClassLoader18);
        java.lang.ClassLoader classLoader21 = java.lang.ClassLoader.getSystemClassLoader();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray16, classLoader21);
        // The following exception was thrown during execution in test generation
        try {
            jarFileArchive3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.close()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray16);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNotNull(classLoader21);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str1 = org.springframework.boot.loader.PropertiesLauncher.toCamelCase((java.lang.CharSequence) "app");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "App" + "'", str1, "App");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.util.Enumeration<java.net.URL> uRLEnumeration13 = launchedURLClassLoader11.findResources("loader.home");
        launchedURLClassLoader11.clearCache();
        launchedURLClassLoader11.clearCache();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLEnumeration13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.lang.ClassLoader classLoader6 = uRLClassLoader5.getParent();
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        uRLClassLoader5.clearAssertionStatus();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.Properties properties0 = null;
        java.lang.String str2 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders(properties0, "app");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "app" + "'", str2, "app");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.InputStream inputStream1 = java.lang.ClassLoader.getSystemResourceAsStream("Loader.Home");
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String[] strArray8 = new java.lang.String[] { ":", "hi!", "loader.path", "}", "hi!" };
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner9 = new org.springframework.boot.loader.MainMethodRunner("hi!", strArray8);
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner10 = new org.springframework.boot.loader.MainMethodRunner("", strArray8);
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner11 = new org.springframework.boot.loader.MainMethodRunner("loader.config.name", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders("Loader.Path");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loader.Path" + "'", str1, "Loader.Path");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.String str12 = jarFileArchive2.toString();
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter13 = null;
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive> archiveItor15 = jarFileArchive2.getNestedArchives(entryFilter13, entryFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jar archive" + "'", str12, "jar archive");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter12 = null;
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive> archiveItor14 = jarFileArchive2.getNestedArchives(entryFilter12, entryFilter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.net.URL uRL7 = uRLClassLoader5.getResource("}");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader8 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        launchedURLClassLoader8.setDefaultAssertionStatus(false);
        java.lang.String str11 = launchedURLClassLoader8.getName();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray12 = uRLClassLoader6.getURLs();
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = uRLClassLoader14.getParent();
        java.lang.Module module16 = classLoader15.getUnnamedModule();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader17 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray12, classLoader15);
        boolean boolean18 = launchedURLClassLoader17.isRegisteredAsParallelCapable();
        launchedURLClassLoader17.clearAssertionStatus();
        launchedURLClassLoader17.clearAssertionStatus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(module16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        boolean boolean3 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = jarFileArchive1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray14 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader15 = java.net.URLClassLoader.newInstance(uRLArray14);
        uRLClassLoader15.clearAssertionStatus();
        java.net.URL[] uRLArray17 = uRLClassLoader15.getURLs();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader19 = java.net.URLClassLoader.newInstance(uRLArray18);
        java.net.URL uRL21 = uRLClassLoader19.getResource("}");
        java.net.URL uRL23 = uRLClassLoader19.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader24 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray17, (java.lang.ClassLoader) uRLClassLoader19);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray5, (java.lang.ClassLoader) launchedURLClassLoader24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = launchedURLClassLoader24.loadClass("loader.main");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: loader.main");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray14);
        org.junit.Assert.assertNotNull(uRLClassLoader15);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLClassLoader19);
        org.junit.Assert.assertNull(uRL21);
// flaky:         org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = uRLClassLoader1.getURLs();
        java.lang.Package package6 = uRLClassLoader1.getDefinedPackage("app");
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNull(package6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.net.URL[] uRLArray2 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray2);
        java.lang.ClassLoader classLoader4 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader5 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, classLoader4);
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        uRLClassLoader7.clearAssertionStatus();
        java.net.URL[] uRLArray9 = uRLClassLoader7.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader10 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, (java.lang.ClassLoader) uRLClassLoader7);
        java.lang.Class<?> wildcardClass11 = uRLArray2.getClass();
        org.junit.Assert.assertNotNull(uRLArray2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNotNull(uRLArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader4 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray1, classLoader3);
        java.io.InputStream inputStream6 = launchedURLClassLoader4.getResourceAsStream(":");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = inputStream6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader4 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray1, classLoader3);
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        uRLClassLoader6.clearAssertionStatus();
        java.net.URL[] uRLArray8 = uRLClassLoader6.getURLs();
        java.lang.ClassLoader classLoader9 = uRLClassLoader6.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader10 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray1, classLoader9);
        java.net.URL uRL12 = launchedURLClassLoader10.getResource("");
        java.net.URL uRL14 = launchedURLClassLoader10.getResource("");
        java.net.URL[] uRLArray15 = launchedURLClassLoader10.getURLs();
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(classLoader9);
// flaky:         org.junit.Assert.assertNull(uRL12);
// flaky:         org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(uRLArray15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        uRLClassLoader5.clearAssertionStatus();
        java.net.URL[] uRLArray7 = uRLClassLoader5.getURLs();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = uRLClassLoader9.getParent();
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray7, (java.lang.ClassLoader) uRLClassLoader9);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray13, classLoader15);
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        uRLClassLoader18.clearAssertionStatus();
        java.net.URL[] uRLArray20 = uRLClassLoader18.getURLs();
        java.lang.ClassLoader classLoader21 = uRLClassLoader18.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray13, classLoader21);
        java.net.URL uRL24 = launchedURLClassLoader22.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream26 = launchedURLClassLoader22.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader27 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray7, (java.lang.ClassLoader) launchedURLClassLoader22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest28 = jarFileArchive2.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(classLoader21);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLStream26);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.util.Enumeration<java.net.URL> uRLEnumeration13 = launchedURLClassLoader11.findResources("loader.home");
        launchedURLClassLoader11.clearAssertionStatus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLEnumeration13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str1 = org.springframework.boot.loader.PropertiesLauncher.toCamelCase((java.lang.CharSequence) "loader.config.location");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loader.Config.Location" + "'", str1, "Loader.Config.Location");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.net.URL uRL7 = uRLClassLoader5.getResource("}");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader8 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        java.util.Enumeration<java.net.URL> uRLEnumeration10 = launchedURLClassLoader8.findResources(":");
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(uRLEnumeration10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        uRLClassLoader5.clearAssertionStatus();
        java.net.URL[] uRLArray7 = uRLClassLoader5.getURLs();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = uRLClassLoader9.getParent();
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray7, (java.lang.ClassLoader) uRLClassLoader9);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray13, classLoader15);
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        uRLClassLoader18.clearAssertionStatus();
        java.net.URL[] uRLArray20 = uRLClassLoader18.getURLs();
        java.lang.ClassLoader classLoader21 = uRLClassLoader18.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray13, classLoader21);
        java.net.URL uRL24 = launchedURLClassLoader22.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream26 = launchedURLClassLoader22.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader27 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray7, (java.lang.ClassLoader) launchedURLClassLoader22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor28 = jarFileArchive2.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(classLoader21);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLStream26);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray12 = uRLClassLoader6.getURLs();
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = uRLClassLoader14.getParent();
        java.lang.Module module16 = classLoader15.getUnnamedModule();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader17 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray12, classLoader15);
        java.net.URL uRL19 = launchedURLClassLoader17.findResource("Loader.Path");
        java.net.URL uRL21 = launchedURLClassLoader17.findResource("}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(module16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray14 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader15 = java.net.URLClassLoader.newInstance(uRLArray14);
        uRLClassLoader15.clearAssertionStatus();
        java.net.URL[] uRLArray17 = uRLClassLoader15.getURLs();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader19 = java.net.URLClassLoader.newInstance(uRLArray18);
        java.net.URL uRL21 = uRLClassLoader19.getResource("}");
        java.net.URL uRL23 = uRLClassLoader19.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader24 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray17, (java.lang.ClassLoader) uRLClassLoader19);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray5, (java.lang.ClassLoader) launchedURLClassLoader24);
        java.io.InputStream inputStream27 = launchedURLClassLoader24.getResourceAsStream("}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray14);
        org.junit.Assert.assertNotNull(uRLClassLoader15);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLClassLoader19);
        org.junit.Assert.assertNull(uRL21);
// flaky:         org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(inputStream27);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URL[] uRLArray2 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray2);
        java.lang.ClassLoader classLoader4 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader5 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, classLoader4);
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        uRLClassLoader7.clearAssertionStatus();
        java.net.URL[] uRLArray9 = uRLClassLoader7.getURLs();
        java.lang.ClassLoader classLoader10 = uRLClassLoader7.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray2, classLoader10);
        java.net.URL uRL13 = launchedURLClassLoader11.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream15 = launchedURLClassLoader11.resources(":");
        launchedURLClassLoader11.clearCache();
        launchedURLClassLoader11.clearCache();
        boolean boolean18 = launchedURLClassLoader11.isRegisteredAsParallelCapable();
        java.net.URLClassLoader uRLClassLoader19 = java.net.URLClassLoader.newInstance(uRLArray0, (java.lang.ClassLoader) launchedURLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLArray2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNotNull(uRLArray9);
        org.junit.Assert.assertNotNull(classLoader10);
// flaky:         org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(uRLStream15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(uRLClassLoader19);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        java.lang.String str3 = jarFileArchive1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = jarFileArchive1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jar archive" + "'", str3, "jar archive");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray12 = uRLClassLoader6.getURLs();
        java.net.URL[] uRLArray13 = uRLClassLoader6.getURLs();
        java.net.URL uRL15 = uRLClassLoader6.getResource("${");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        uRLClassLoader5.clearAssertionStatus();
        java.net.URL[] uRLArray7 = uRLClassLoader5.getURLs();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = uRLClassLoader9.getParent();
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray7, (java.lang.ClassLoader) uRLClassLoader9);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray13, classLoader15);
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        uRLClassLoader18.clearAssertionStatus();
        java.net.URL[] uRLArray20 = uRLClassLoader18.getURLs();
        java.lang.ClassLoader classLoader21 = uRLClassLoader18.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray13, classLoader21);
        java.net.URL uRL24 = launchedURLClassLoader22.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream26 = launchedURLClassLoader22.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader27 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray7, (java.lang.ClassLoader) launchedURLClassLoader22);
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.boot.loader.archive.Archive> archiveList29 = jarFileArchive2.getNestedArchives(entryFilter28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected call to getNestedArchives(filter)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(classLoader21);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLStream26);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        boolean boolean12 = jarFileArchive2.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL13 = jarFileArchive2.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.String str12 = jarFileArchive2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL13 = jarFileArchive2.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jar archive" + "'", str12, "jar archive");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str3 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("Loader.Home", "loader.path", "}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "loader.path" + "'", str3, "loader.path");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.net.URL uRL7 = uRLClassLoader5.getResource("}");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader8 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        launchedURLClassLoader8.setDefaultAssertionStatus(false);
        java.net.URL[] uRLArray11 = launchedURLClassLoader8.getURLs();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(uRLArray11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.InputStream inputStream1 = java.lang.ClassLoader.getSystemResourceAsStream("loader.system");
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.net.URL[] uRLArray2 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray2);
        java.lang.ClassLoader classLoader4 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader5 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, classLoader4);
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        uRLClassLoader7.clearAssertionStatus();
        java.net.URL[] uRLArray9 = uRLClassLoader7.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader10 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, (java.lang.ClassLoader) uRLClassLoader7);
        java.util.Enumeration<java.net.URL> uRLEnumeration12 = launchedURLClassLoader10.findResources("Loader.Config.Name");
        launchedURLClassLoader10.clearCache();
        org.junit.Assert.assertNotNull(uRLArray2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNotNull(uRLArray9);
        org.junit.Assert.assertNotNull(uRLEnumeration12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.net.URL uRL3 = uRLClassLoader1.getResource("}");
        java.net.URL uRL5 = uRLClassLoader1.getResource("");
        uRLClassLoader1.setDefaultAssertionStatus(false);
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNull(uRL3);
// flaky:         org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        boolean boolean4 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, classLoader10);
        java.net.URL[] uRLArray12 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader13 = java.net.URLClassLoader.newInstance(uRLArray12);
        uRLClassLoader13.clearAssertionStatus();
        java.net.URL[] uRLArray15 = uRLClassLoader13.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, (java.lang.ClassLoader) uRLClassLoader13);
        java.net.URLClassLoader uRLClassLoader17 = java.net.URLClassLoader.newInstance(uRLArray5, (java.lang.ClassLoader) launchedURLClassLoader16);
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray5, classLoader18);
        java.lang.String str20 = launchedURLClassLoader19.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLClassLoader13);
        org.junit.Assert.assertNotNull(uRLArray15);
        org.junit.Assert.assertNotNull(uRLClassLoader17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        uRLClassLoader14.clearAssertionStatus();
        java.net.URL[] uRLArray16 = uRLClassLoader14.getURLs();
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        java.lang.ClassLoader classLoader19 = uRLClassLoader18.getParent();
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray16, (java.lang.ClassLoader) uRLClassLoader18);
        java.lang.ClassLoader classLoader21 = java.lang.ClassLoader.getSystemClassLoader();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray16, classLoader21);
        launchedURLClassLoader22.clearCache();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray16);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNotNull(classLoader21);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        uRLClassLoader14.clearAssertionStatus();
        java.net.URL[] uRLArray16 = uRLClassLoader14.getURLs();
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        java.lang.ClassLoader classLoader19 = uRLClassLoader18.getParent();
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray16, (java.lang.ClassLoader) uRLClassLoader18);
        java.lang.ClassLoader classLoader21 = java.lang.ClassLoader.getSystemClassLoader();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray16, classLoader21);
        boolean boolean23 = jarFileArchive3.isExploded();
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter24 = null;
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive> archiveItor26 = jarFileArchive3.getNestedArchives(entryFilter24, entryFilter25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray16);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        java.lang.ClassLoader classLoader6 = uRLClassLoader5.getParent();
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray3, (java.lang.ClassLoader) uRLClassLoader5);
        java.lang.Package package9 = uRLClassLoader7.getDefinedPackage("loader.args");
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(package9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.net.URL[] uRLArray2 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray2);
        java.lang.ClassLoader classLoader4 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader5 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, classLoader4);
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        uRLClassLoader7.clearAssertionStatus();
        java.net.URL[] uRLArray9 = uRLClassLoader7.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader10 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, (java.lang.ClassLoader) uRLClassLoader7);
        java.util.Enumeration<java.net.URL> uRLEnumeration12 = launchedURLClassLoader10.findResources("loader.args");
        launchedURLClassLoader10.clearAssertionStatus();
        org.junit.Assert.assertNotNull(uRLArray2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNotNull(uRLArray9);
        org.junit.Assert.assertNotNull(uRLEnumeration12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        java.lang.String str3 = jarFileArchive1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest4 = jarFileArchive1.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jar archive" + "'", str3, "jar archive");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        uRLClassLoader5.clearAssertionStatus();
        java.net.URL[] uRLArray7 = uRLClassLoader5.getURLs();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = uRLClassLoader9.getParent();
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray7, (java.lang.ClassLoader) uRLClassLoader9);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray13, classLoader15);
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        uRLClassLoader18.clearAssertionStatus();
        java.net.URL[] uRLArray20 = uRLClassLoader18.getURLs();
        java.lang.ClassLoader classLoader21 = uRLClassLoader18.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray13, classLoader21);
        java.net.URL uRL24 = launchedURLClassLoader22.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream26 = launchedURLClassLoader22.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader27 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray7, (java.lang.ClassLoader) launchedURLClassLoader22);
        java.lang.Class<?> wildcardClass28 = jarFileArchive2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(classLoader21);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLStream26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.lang.Package package5 = uRLClassLoader1.getDefinedPackage("hi!");
        java.lang.Package package7 = uRLClassLoader1.getDefinedPackage("");
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNull(package5);
        org.junit.Assert.assertNull(package7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "${" };
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner5 = new org.springframework.boot.loader.MainMethodRunner("jar archive", strArray4);
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner6 = new org.springframework.boot.loader.MainMethodRunner("loader.system", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            mainMethodRunner6.run();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: loader.system");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        boolean boolean4 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, classLoader10);
        java.net.URL[] uRLArray12 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader13 = java.net.URLClassLoader.newInstance(uRLArray12);
        uRLClassLoader13.clearAssertionStatus();
        java.net.URL[] uRLArray15 = uRLClassLoader13.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, (java.lang.ClassLoader) uRLClassLoader13);
        java.net.URLClassLoader uRLClassLoader17 = java.net.URLClassLoader.newInstance(uRLArray5, (java.lang.ClassLoader) launchedURLClassLoader16);
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray5, classLoader18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest20 = jarFileArchive2.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLClassLoader13);
        org.junit.Assert.assertNotNull(uRLArray15);
        org.junit.Assert.assertNotNull(uRLClassLoader17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest3 = jarFileArchive1.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner3 = new org.springframework.boot.loader.MainMethodRunner("}", strArray2);
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner4 = new org.springframework.boot.loader.MainMethodRunner("loader.main", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            mainMethodRunner4.run();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: loader.main");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile15 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive16 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile15);
        boolean boolean17 = jarFileArchive16.isExploded();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URL[] uRLArray19 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray19);
        java.net.URL uRL22 = uRLClassLoader20.getResource("}");
        java.net.URL uRL24 = uRLClassLoader20.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive16, uRLArray18, (java.lang.ClassLoader) uRLClassLoader20);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader26 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray13, (java.lang.ClassLoader) uRLClassLoader20);
        boolean boolean27 = jarFileArchive3.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest28 = jarFileArchive3.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLArray19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNull(uRL22);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        java.lang.String str3 = jarFileArchive1.toString();
        boolean boolean4 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest5 = jarFileArchive1.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jar archive" + "'", str3, "jar archive");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        uRLClassLoader2.clearAssertionStatus();
        java.net.URL[] uRLArray4 = uRLClassLoader2.getURLs();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.io.InputStream inputStream13 = launchedURLClassLoader11.getResourceAsStream("hi!");
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        boolean boolean4 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, classLoader10);
        java.net.URL[] uRLArray12 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader13 = java.net.URLClassLoader.newInstance(uRLArray12);
        uRLClassLoader13.clearAssertionStatus();
        java.net.URL[] uRLArray15 = uRLClassLoader13.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, (java.lang.ClassLoader) uRLClassLoader13);
        java.net.URLClassLoader uRLClassLoader17 = java.net.URLClassLoader.newInstance(uRLArray5, (java.lang.ClassLoader) launchedURLClassLoader16);
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray5, classLoader18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest20 = jarFileArchive2.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLClassLoader13);
        org.junit.Assert.assertNotNull(uRLArray15);
        org.junit.Assert.assertNotNull(uRLClassLoader17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        uRLClassLoader14.clearAssertionStatus();
        java.net.URL[] uRLArray16 = uRLClassLoader14.getURLs();
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        java.lang.ClassLoader classLoader19 = uRLClassLoader18.getParent();
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray16, (java.lang.ClassLoader) uRLClassLoader18);
        java.lang.ClassLoader classLoader21 = java.lang.ClassLoader.getSystemClassLoader();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray16, classLoader21);
        boolean boolean23 = jarFileArchive3.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest24 = jarFileArchive3.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getManifest()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray16);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray12 = uRLClassLoader6.getURLs();
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = uRLClassLoader14.getParent();
        java.lang.Module module16 = classLoader15.getUnnamedModule();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader17 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray12, classLoader15);
        launchedURLClassLoader17.clearAssertionStatus();
        launchedURLClassLoader17.clearCache();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(module16);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str2 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("", "loader.config.name");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "loader.config.name" + "'", str2, "loader.config.name");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile3 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive4 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile3);
        boolean boolean5 = jarFileArchive4.isExploded();
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        java.net.URL uRL10 = uRLClassLoader8.getResource("}");
        java.net.URL uRL12 = uRLClassLoader8.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader13 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive4, uRLArray6, (java.lang.ClassLoader) uRLClassLoader8);
        java.util.Enumeration<java.net.URL> uRLEnumeration15 = launchedURLClassLoader13.findResources("loader.home");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray1, (java.lang.ClassLoader) launchedURLClassLoader13);
        java.lang.Package package18 = launchedURLClassLoader16.getDefinedPackage("Loader.Path");
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNull(uRL10);
// flaky:         org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(uRLEnumeration15);
        org.junit.Assert.assertNull(package18);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.Enumeration<java.net.URL> uRLEnumeration1 = java.lang.ClassLoader.getSystemResources("}");
        org.junit.Assert.assertNotNull(uRLEnumeration1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader4 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray1, classLoader3);
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        uRLClassLoader6.clearAssertionStatus();
        java.net.URL[] uRLArray8 = uRLClassLoader6.getURLs();
        java.lang.ClassLoader classLoader9 = uRLClassLoader6.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader10 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray1, classLoader9);
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray1);
        java.net.URL[] uRLArray12 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader13 = java.net.URLClassLoader.newInstance(uRLArray12);
        uRLClassLoader13.clearAssertionStatus();
        java.net.URL[] uRLArray15 = uRLClassLoader13.getURLs();
        java.net.URL[] uRLArray16 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader17 = java.net.URLClassLoader.newInstance(uRLArray16);
        java.net.URL uRL19 = uRLClassLoader17.getResource("}");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader20 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray15, (java.lang.ClassLoader) uRLClassLoader17);
        launchedURLClassLoader20.setDefaultAssertionStatus(false);
        java.net.URLClassLoader uRLClassLoader23 = java.net.URLClassLoader.newInstance(uRLArray1, (java.lang.ClassLoader) launchedURLClassLoader20);
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLClassLoader13);
        org.junit.Assert.assertNotNull(uRLArray15);
        org.junit.Assert.assertNotNull(uRLArray16);
        org.junit.Assert.assertNotNull(uRLClassLoader17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(uRLClassLoader23);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.Properties properties0 = null;
        java.lang.String str2 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders(properties0, "loader.home");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "loader.home" + "'", str2, "loader.home");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        boolean boolean5 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        uRLClassLoader8.clearAssertionStatus();
        java.net.URL[] uRLArray10 = uRLClassLoader8.getURLs();
        java.net.URL[] uRLArray11 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader12 = java.net.URLClassLoader.newInstance(uRLArray11);
        java.lang.ClassLoader classLoader13 = uRLClassLoader12.getParent();
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray10, (java.lang.ClassLoader) uRLClassLoader12);
        java.net.URL[] uRLArray16 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader17 = java.net.URLClassLoader.newInstance(uRLArray16);
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray16, classLoader18);
        java.net.URL[] uRLArray20 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader21 = java.net.URLClassLoader.newInstance(uRLArray20);
        uRLClassLoader21.clearAssertionStatus();
        java.net.URL[] uRLArray23 = uRLClassLoader21.getURLs();
        java.lang.ClassLoader classLoader24 = uRLClassLoader21.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray16, classLoader24);
        java.net.URL uRL27 = launchedURLClassLoader25.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream29 = launchedURLClassLoader25.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader30 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray10, (java.lang.ClassLoader) launchedURLClassLoader25);
        java.lang.ClassLoader classLoader31 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader32 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray10, classLoader31);
        org.springframework.boot.loader.jar.JarFile jarFile35 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive36 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile35);
        boolean boolean37 = jarFileArchive36.isExploded();
        java.net.URL[] uRLArray38 = new java.net.URL[] {};
        java.net.URL[] uRLArray39 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader40 = java.net.URLClassLoader.newInstance(uRLArray39);
        java.net.URL uRL42 = uRLClassLoader40.getResource("}");
        java.net.URL uRL44 = uRLClassLoader40.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader45 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive36, uRLArray38, (java.lang.ClassLoader) uRLClassLoader40);
        java.net.URL[] uRLArray47 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader48 = java.net.URLClassLoader.newInstance(uRLArray47);
        uRLClassLoader48.clearAssertionStatus();
        java.net.URL[] uRLArray50 = uRLClassLoader48.getURLs();
        java.net.URL[] uRLArray51 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader52 = java.net.URLClassLoader.newInstance(uRLArray51);
        java.net.URL uRL54 = uRLClassLoader52.getResource("}");
        java.net.URL uRL56 = uRLClassLoader52.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader57 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray50, (java.lang.ClassLoader) uRLClassLoader52);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader58 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray38, (java.lang.ClassLoader) launchedURLClassLoader57);
        java.net.URL[] uRLArray59 = new java.net.URL[] {};
        java.net.URL[] uRLArray62 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader63 = java.net.URLClassLoader.newInstance(uRLArray62);
        java.lang.ClassLoader classLoader64 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader65 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray62, classLoader64);
        java.net.URL[] uRLArray66 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader67 = java.net.URLClassLoader.newInstance(uRLArray66);
        uRLClassLoader67.clearAssertionStatus();
        java.net.URL[] uRLArray69 = uRLClassLoader67.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader70 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray62, (java.lang.ClassLoader) uRLClassLoader67);
        java.net.URLClassLoader uRLClassLoader71 = java.net.URLClassLoader.newInstance(uRLArray59, (java.lang.ClassLoader) launchedURLClassLoader70);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader72 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray38, (java.lang.ClassLoader) launchedURLClassLoader70);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader73 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray10, (java.lang.ClassLoader) launchedURLClassLoader72);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLArray11);
        org.junit.Assert.assertNotNull(uRLClassLoader12);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray16);
        org.junit.Assert.assertNotNull(uRLClassLoader17);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(uRLClassLoader21);
        org.junit.Assert.assertNotNull(uRLArray23);
        org.junit.Assert.assertNotNull(classLoader24);
// flaky:         org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(uRLStream29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(uRLArray38);
        org.junit.Assert.assertNotNull(uRLArray39);
        org.junit.Assert.assertNotNull(uRLClassLoader40);
        org.junit.Assert.assertNull(uRL42);
// flaky:         org.junit.Assert.assertNull(uRL44);
        org.junit.Assert.assertNotNull(uRLArray47);
        org.junit.Assert.assertNotNull(uRLClassLoader48);
        org.junit.Assert.assertNotNull(uRLArray50);
        org.junit.Assert.assertNotNull(uRLArray51);
        org.junit.Assert.assertNotNull(uRLClassLoader52);
        org.junit.Assert.assertNull(uRL54);
// flaky:         org.junit.Assert.assertNull(uRL56);
        org.junit.Assert.assertNotNull(uRLArray59);
        org.junit.Assert.assertNotNull(uRLArray62);
        org.junit.Assert.assertNotNull(uRLClassLoader63);
        org.junit.Assert.assertNotNull(uRLArray66);
        org.junit.Assert.assertNotNull(uRLClassLoader67);
        org.junit.Assert.assertNotNull(uRLArray69);
        org.junit.Assert.assertNotNull(uRLClassLoader71);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str1 = org.springframework.boot.loader.PropertiesLauncher.toCamelCase((java.lang.CharSequence) "Loader.Config.Location");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loader.Config.Location" + "'", str1, "Loader.Config.Location");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.springframework.boot.loader.jar.JarFile jarFile3 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive4 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile3);
        boolean boolean5 = jarFileArchive4.isExploded();
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        java.net.URL uRL10 = uRLClassLoader8.getResource("}");
        java.net.URL uRL12 = uRLClassLoader8.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader13 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive4, uRLArray6, (java.lang.ClassLoader) uRLClassLoader8);
        java.net.URL[] uRLArray14 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader15 = java.net.URLClassLoader.newInstance(uRLArray14);
        uRLClassLoader15.clearAssertionStatus();
        java.net.URL[] uRLArray17 = uRLClassLoader15.getURLs();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader19 = java.net.URLClassLoader.newInstance(uRLArray18);
        java.lang.ClassLoader classLoader20 = uRLClassLoader19.getParent();
        java.net.URLClassLoader uRLClassLoader21 = java.net.URLClassLoader.newInstance(uRLArray17, (java.lang.ClassLoader) uRLClassLoader19);
        java.lang.ClassLoader classLoader22 = java.lang.ClassLoader.getSystemClassLoader();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader23 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive4, uRLArray17, classLoader22);
        java.net.URL[] uRLArray24 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader25 = java.net.URLClassLoader.newInstance(uRLArray24);
        uRLClassLoader25.clearAssertionStatus();
        java.net.URL[] uRLArray27 = uRLClassLoader25.getURLs();
        org.springframework.boot.loader.jar.JarFile jarFile30 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive31 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile30);
        boolean boolean32 = jarFileArchive31.isExploded();
        boolean boolean33 = jarFileArchive31.isExploded();
        java.net.URL[] uRLArray35 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader36 = java.net.URLClassLoader.newInstance(uRLArray35);
        uRLClassLoader36.clearAssertionStatus();
        java.net.URL[] uRLArray38 = uRLClassLoader36.getURLs();
        java.net.URL[] uRLArray39 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader40 = java.net.URLClassLoader.newInstance(uRLArray39);
        java.lang.ClassLoader classLoader41 = uRLClassLoader40.getParent();
        java.net.URLClassLoader uRLClassLoader42 = java.net.URLClassLoader.newInstance(uRLArray38, (java.lang.ClassLoader) uRLClassLoader40);
        java.net.URL[] uRLArray44 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader45 = java.net.URLClassLoader.newInstance(uRLArray44);
        java.lang.ClassLoader classLoader46 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader47 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray44, classLoader46);
        java.net.URL[] uRLArray48 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader49 = java.net.URLClassLoader.newInstance(uRLArray48);
        uRLClassLoader49.clearAssertionStatus();
        java.net.URL[] uRLArray51 = uRLClassLoader49.getURLs();
        java.lang.ClassLoader classLoader52 = uRLClassLoader49.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader53 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray44, classLoader52);
        java.net.URL uRL55 = launchedURLClassLoader53.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream57 = launchedURLClassLoader53.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader58 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray38, (java.lang.ClassLoader) launchedURLClassLoader53);
        java.lang.ClassLoader classLoader59 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader60 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive31, uRLArray38, classLoader59);
        java.net.URL[] uRLArray62 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader63 = java.net.URLClassLoader.newInstance(uRLArray62);
        uRLClassLoader63.clearAssertionStatus();
        java.net.URL[] uRLArray65 = uRLClassLoader63.getURLs();
        java.net.URL[] uRLArray66 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader67 = java.net.URLClassLoader.newInstance(uRLArray66);
        java.net.URL uRL69 = uRLClassLoader67.getResource("}");
        java.net.URL uRL71 = uRLClassLoader67.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader72 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray65, (java.lang.ClassLoader) uRLClassLoader67);
        java.net.URL[] uRLArray75 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader76 = java.net.URLClassLoader.newInstance(uRLArray75);
        java.lang.ClassLoader classLoader77 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader78 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray75, classLoader77);
        java.net.URL[] uRLArray79 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader80 = java.net.URLClassLoader.newInstance(uRLArray79);
        uRLClassLoader80.clearAssertionStatus();
        java.net.URL[] uRLArray82 = uRLClassLoader80.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader83 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray75, (java.lang.ClassLoader) uRLClassLoader80);
        java.util.Enumeration<java.net.URL> uRLEnumeration85 = launchedURLClassLoader83.findResources("Loader.Config.Name");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader86 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive31, uRLArray65, (java.lang.ClassLoader) launchedURLClassLoader83);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader87 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive4, uRLArray27, (java.lang.ClassLoader) launchedURLClassLoader83);
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter88 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.boot.loader.archive.Archive> archiveList89 = jarFileArchive4.getNestedArchives(entryFilter88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected call to getNestedArchives(filter)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNull(uRL10);
// flaky:         org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(uRLArray14);
        org.junit.Assert.assertNotNull(uRLClassLoader15);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLClassLoader19);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertNotNull(uRLClassLoader21);
        org.junit.Assert.assertNotNull(classLoader22);
        org.junit.Assert.assertNotNull(uRLArray24);
        org.junit.Assert.assertNotNull(uRLClassLoader25);
        org.junit.Assert.assertNotNull(uRLArray27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(uRLArray35);
        org.junit.Assert.assertNotNull(uRLClassLoader36);
        org.junit.Assert.assertNotNull(uRLArray38);
        org.junit.Assert.assertNotNull(uRLArray39);
        org.junit.Assert.assertNotNull(uRLClassLoader40);
        org.junit.Assert.assertNotNull(classLoader41);
        org.junit.Assert.assertNotNull(uRLClassLoader42);
        org.junit.Assert.assertNotNull(uRLArray44);
        org.junit.Assert.assertNotNull(uRLClassLoader45);
        org.junit.Assert.assertNotNull(uRLArray48);
        org.junit.Assert.assertNotNull(uRLClassLoader49);
        org.junit.Assert.assertNotNull(uRLArray51);
        org.junit.Assert.assertNotNull(classLoader52);
// flaky:         org.junit.Assert.assertNull(uRL55);
        org.junit.Assert.assertNotNull(uRLStream57);
        org.junit.Assert.assertNotNull(uRLArray62);
        org.junit.Assert.assertNotNull(uRLClassLoader63);
        org.junit.Assert.assertNotNull(uRLArray65);
        org.junit.Assert.assertNotNull(uRLArray66);
        org.junit.Assert.assertNotNull(uRLClassLoader67);
        org.junit.Assert.assertNull(uRL69);
// flaky:         org.junit.Assert.assertNull(uRL71);
        org.junit.Assert.assertNotNull(uRLArray75);
        org.junit.Assert.assertNotNull(uRLClassLoader76);
        org.junit.Assert.assertNotNull(uRLArray79);
        org.junit.Assert.assertNotNull(uRLClassLoader80);
        org.junit.Assert.assertNotNull(uRLArray82);
        org.junit.Assert.assertNotNull(uRLEnumeration85);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        uRLClassLoader5.clearAssertionStatus();
        java.net.URL[] uRLArray7 = uRLClassLoader5.getURLs();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = uRLClassLoader9.getParent();
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray7, (java.lang.ClassLoader) uRLClassLoader9);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray13, classLoader15);
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        uRLClassLoader18.clearAssertionStatus();
        java.net.URL[] uRLArray20 = uRLClassLoader18.getURLs();
        java.lang.ClassLoader classLoader21 = uRLClassLoader18.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray13, classLoader21);
        java.net.URL uRL24 = launchedURLClassLoader22.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream26 = launchedURLClassLoader22.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader27 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray7, (java.lang.ClassLoader) launchedURLClassLoader22);
        // The following exception was thrown during execution in test generation
        try {
            jarFileArchive2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.close()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(classLoader21);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLStream26);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.lang.ClassLoader classLoader4 = uRLClassLoader1.getParent();
        java.lang.Package[] packageArray5 = uRLClassLoader1.getDefinedPackages();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(packageArray5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        uRLClassLoader1.clearAssertionStatus();
        java.net.URL[] uRLArray3 = uRLClassLoader1.getURLs();
        java.lang.ClassLoader classLoader4 = uRLClassLoader1.getParent();
        java.lang.Package package6 = classLoader4.getDefinedPackage("Loader.Path");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = package6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNull(package6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.String str2 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("loader.config.name", "jar archive");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jar archive" + "'", str2, "jar archive");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str2 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("Loader.Config.Location", "loader.config.location");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "loader.config.location" + "'", str2, "loader.config.location");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        uRLClassLoader5.clearAssertionStatus();
        java.net.URL[] uRLArray7 = uRLClassLoader5.getURLs();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = uRLClassLoader9.getParent();
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray7, (java.lang.ClassLoader) uRLClassLoader9);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray13, classLoader15);
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        uRLClassLoader18.clearAssertionStatus();
        java.net.URL[] uRLArray20 = uRLClassLoader18.getURLs();
        java.lang.ClassLoader classLoader21 = uRLClassLoader18.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray13, classLoader21);
        java.net.URL uRL24 = launchedURLClassLoader22.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream26 = launchedURLClassLoader22.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader27 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray7, (java.lang.ClassLoader) launchedURLClassLoader22);
        launchedURLClassLoader22.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(classLoader21);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLStream26);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        uRLClassLoader14.clearAssertionStatus();
        java.net.URL[] uRLArray16 = uRLClassLoader14.getURLs();
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        java.lang.ClassLoader classLoader19 = uRLClassLoader18.getParent();
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray16, (java.lang.ClassLoader) uRLClassLoader18);
        java.lang.ClassLoader classLoader21 = java.lang.ClassLoader.getSystemClassLoader();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray16, classLoader21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor23 = jarFileArchive3.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray16);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNotNull(classLoader21);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile3 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive4 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile3);
        boolean boolean5 = jarFileArchive4.isExploded();
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        java.net.URL uRL10 = uRLClassLoader8.getResource("}");
        java.net.URL uRL12 = uRLClassLoader8.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader13 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive4, uRLArray6, (java.lang.ClassLoader) uRLClassLoader8);
        java.util.Enumeration<java.net.URL> uRLEnumeration15 = launchedURLClassLoader13.findResources("loader.home");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray1, (java.lang.ClassLoader) launchedURLClassLoader13);
        java.lang.ClassLoader classLoader17 = launchedURLClassLoader16.getParent();
        java.util.stream.Stream<java.net.URL> uRLStream19 = classLoader17.resources("loader.home");
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNull(uRL10);
// flaky:         org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(uRLEnumeration15);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(uRLStream19);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.net.URL uRL3 = uRLClassLoader1.getResource("}");
        java.lang.String str4 = uRLClassLoader1.getName();
        java.io.InputStream inputStream6 = uRLClassLoader1.getResourceAsStream("loader.config.location");
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("");
// flaky:         org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str3 = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty("Loader.Config.Location", "hi!", "loader.config.location");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        uRLClassLoader2.clearAssertionStatus();
        java.net.URL[] uRLArray4 = uRLClassLoader2.getURLs();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.lang.ClassLoader classLoader7 = uRLClassLoader6.getParent();
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray10 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray10);
        java.lang.ClassLoader classLoader12 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader13 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray10, classLoader12);
        java.net.URL[] uRLArray14 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader15 = java.net.URLClassLoader.newInstance(uRLArray14);
        uRLClassLoader15.clearAssertionStatus();
        java.net.URL[] uRLArray17 = uRLClassLoader15.getURLs();
        java.lang.ClassLoader classLoader18 = uRLClassLoader15.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray10, classLoader18);
        java.net.URL uRL21 = launchedURLClassLoader19.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream23 = launchedURLClassLoader19.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader24 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray4, (java.lang.ClassLoader) launchedURLClassLoader19);
        launchedURLClassLoader19.close();
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray14);
        org.junit.Assert.assertNotNull(uRLClassLoader15);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(classLoader18);
// flaky:         org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(uRLStream23);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        launchedURLClassLoader11.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        uRLClassLoader5.clearAssertionStatus();
        java.net.URL[] uRLArray7 = uRLClassLoader5.getURLs();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = uRLClassLoader9.getParent();
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray7, (java.lang.ClassLoader) uRLClassLoader9);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray13, classLoader15);
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        uRLClassLoader18.clearAssertionStatus();
        java.net.URL[] uRLArray20 = uRLClassLoader18.getURLs();
        java.lang.ClassLoader classLoader21 = uRLClassLoader18.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray13, classLoader21);
        java.net.URL uRL24 = launchedURLClassLoader22.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream26 = launchedURLClassLoader22.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader27 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray7, (java.lang.ClassLoader) launchedURLClassLoader22);
        launchedURLClassLoader27.setPackageAssertionStatus("${", false);
        java.net.URL[] uRLArray31 = launchedURLClassLoader27.getURLs();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(classLoader21);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLStream26);
        org.junit.Assert.assertNotNull(uRLArray31);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        java.net.URL uRL9 = uRLClassLoader7.getResource("}");
        java.net.URL uRL11 = uRLClassLoader7.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader12 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray5, (java.lang.ClassLoader) uRLClassLoader7);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile15 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive16 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile15);
        boolean boolean17 = jarFileArchive16.isExploded();
        java.net.URL[] uRLArray18 = new java.net.URL[] {};
        java.net.URL[] uRLArray19 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray19);
        java.net.URL uRL22 = uRLClassLoader20.getResource("}");
        java.net.URL uRL24 = uRLClassLoader20.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive16, uRLArray18, (java.lang.ClassLoader) uRLClassLoader20);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader26 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray13, (java.lang.ClassLoader) uRLClassLoader20);
        boolean boolean27 = jarFileArchive3.isExploded();
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.boot.loader.archive.Archive> archiveList29 = jarFileArchive3.getNestedArchives(entryFilter28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected call to getNestedArchives(filter)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNull(uRL9);
// flaky:         org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLArray19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNull(uRL22);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray12 = uRLClassLoader6.getURLs();
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = uRLClassLoader14.getParent();
        java.lang.Module module16 = classLoader15.getUnnamedModule();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader17 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray12, classLoader15);
        java.net.URL uRL19 = launchedURLClassLoader17.findResource("Loader.Path");
        boolean boolean20 = launchedURLClassLoader17.isRegisteredAsParallelCapable();
        launchedURLClassLoader17.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(module16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        boolean boolean4 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        uRLClassLoader7.clearAssertionStatus();
        java.net.URL[] uRLArray9 = uRLClassLoader7.getURLs();
        java.net.URL[] uRLArray10 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray10);
        java.lang.ClassLoader classLoader12 = uRLClassLoader11.getParent();
        java.net.URLClassLoader uRLClassLoader13 = java.net.URLClassLoader.newInstance(uRLArray9, (java.lang.ClassLoader) uRLClassLoader11);
        java.net.URL[] uRLArray15 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader16 = java.net.URLClassLoader.newInstance(uRLArray15);
        java.lang.ClassLoader classLoader17 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader18 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray15, classLoader17);
        java.net.URL[] uRLArray19 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray19);
        uRLClassLoader20.clearAssertionStatus();
        java.net.URL[] uRLArray22 = uRLClassLoader20.getURLs();
        java.lang.ClassLoader classLoader23 = uRLClassLoader20.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader24 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray15, classLoader23);
        java.net.URL uRL26 = launchedURLClassLoader24.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream28 = launchedURLClassLoader24.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader29 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray9, (java.lang.ClassLoader) launchedURLClassLoader24);
        java.lang.ClassLoader classLoader30 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader31 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray9, classLoader30);
        java.lang.String str32 = jarFileArchive2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNotNull(uRLArray9);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(uRLClassLoader13);
        org.junit.Assert.assertNotNull(uRLArray15);
        org.junit.Assert.assertNotNull(uRLClassLoader16);
        org.junit.Assert.assertNotNull(uRLArray19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNotNull(uRLArray22);
        org.junit.Assert.assertNotNull(classLoader23);
// flaky:         org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(uRLStream28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "jar archive" + "'", str32, "jar archive");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        boolean boolean4 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, classLoader10);
        java.net.URL[] uRLArray12 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader13 = java.net.URLClassLoader.newInstance(uRLArray12);
        uRLClassLoader13.clearAssertionStatus();
        java.net.URL[] uRLArray15 = uRLClassLoader13.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, (java.lang.ClassLoader) uRLClassLoader13);
        java.net.URLClassLoader uRLClassLoader17 = java.net.URLClassLoader.newInstance(uRLArray5, (java.lang.ClassLoader) launchedURLClassLoader16);
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray5, classLoader18);
        // The following exception was thrown during execution in test generation
        try {
            jarFileArchive2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.close()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLClassLoader13);
        org.junit.Assert.assertNotNull(uRLArray15);
        org.junit.Assert.assertNotNull(uRLClassLoader17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.net.URL[] uRLArray2 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray2);
        java.lang.ClassLoader classLoader4 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader5 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, classLoader4);
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader7 = java.net.URLClassLoader.newInstance(uRLArray6);
        uRLClassLoader7.clearAssertionStatus();
        java.net.URL[] uRLArray9 = uRLClassLoader7.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader10 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, (java.lang.ClassLoader) uRLClassLoader7);
        java.util.Enumeration<java.net.URL> uRLEnumeration12 = launchedURLClassLoader10.findResources("Loader.Config.Name");
        launchedURLClassLoader10.setPackageAssertionStatus("hi!", false);
        org.junit.Assert.assertNotNull(uRLArray2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLClassLoader7);
        org.junit.Assert.assertNotNull(uRLArray9);
        org.junit.Assert.assertNotNull(uRLEnumeration12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader5 = java.net.URLClassLoader.newInstance(uRLArray4);
        uRLClassLoader5.clearAssertionStatus();
        java.net.URL[] uRLArray7 = uRLClassLoader5.getURLs();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = uRLClassLoader9.getParent();
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray7, (java.lang.ClassLoader) uRLClassLoader9);
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray13, classLoader15);
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        uRLClassLoader18.clearAssertionStatus();
        java.net.URL[] uRLArray20 = uRLClassLoader18.getURLs();
        java.lang.ClassLoader classLoader21 = uRLClassLoader18.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader22 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray13, classLoader21);
        java.net.URL uRL24 = launchedURLClassLoader22.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream26 = launchedURLClassLoader22.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader27 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray7, (java.lang.ClassLoader) launchedURLClassLoader22);
        boolean boolean28 = jarFileArchive2.isExploded();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLClassLoader5);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(classLoader21);
// flaky:         org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(uRLStream26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        uRLClassLoader2.clearAssertionStatus();
        java.net.URL[] uRLArray4 = uRLClassLoader2.getURLs();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.lang.ClassLoader classLoader7 = uRLClassLoader6.getParent();
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray10 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray10);
        java.lang.ClassLoader classLoader12 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader13 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray10, classLoader12);
        java.net.URL[] uRLArray14 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader15 = java.net.URLClassLoader.newInstance(uRLArray14);
        uRLClassLoader15.clearAssertionStatus();
        java.net.URL[] uRLArray17 = uRLClassLoader15.getURLs();
        java.lang.ClassLoader classLoader18 = uRLClassLoader15.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray10, classLoader18);
        java.net.URL uRL21 = launchedURLClassLoader19.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream23 = launchedURLClassLoader19.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader24 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray4, (java.lang.ClassLoader) launchedURLClassLoader19);
        java.net.URL uRL26 = launchedURLClassLoader19.findResource("loader.path");
        launchedURLClassLoader19.clearCache();
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray14);
        org.junit.Assert.assertNotNull(uRLClassLoader15);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(classLoader18);
// flaky:         org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(uRLStream23);
        org.junit.Assert.assertNull(uRL26);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.net.URL uRL3 = uRLClassLoader1.getResource("}");
        java.lang.String str4 = uRLClassLoader1.getName();
        uRLClassLoader1.clearAssertionStatus();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.String str1 = org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders("loader.config.name");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "loader.config.name" + "'", str1, "loader.config.name");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        uRLClassLoader2.clearAssertionStatus();
        java.net.URL[] uRLArray4 = uRLClassLoader2.getURLs();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.Package[] packageArray12 = uRLClassLoader6.getDefinedPackages();
        java.lang.Module module13 = uRLClassLoader6.getUnnamedModule();
        uRLClassLoader6.setDefaultAssertionStatus(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = uRLClassLoader6.loadClass("Loader.Home");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Loader.Home");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(packageArray12);
        org.junit.Assert.assertNotNull(module13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.springframework.boot.loader.jar.JarFile jarFile2 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive3 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile2);
        boolean boolean4 = jarFileArchive3.isExploded();
        boolean boolean5 = jarFileArchive3.isExploded();
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        uRLClassLoader8.clearAssertionStatus();
        java.net.URL[] uRLArray10 = uRLClassLoader8.getURLs();
        java.net.URL[] uRLArray11 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader12 = java.net.URLClassLoader.newInstance(uRLArray11);
        java.lang.ClassLoader classLoader13 = uRLClassLoader12.getParent();
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray10, (java.lang.ClassLoader) uRLClassLoader12);
        java.net.URL[] uRLArray16 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader17 = java.net.URLClassLoader.newInstance(uRLArray16);
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray16, classLoader18);
        java.net.URL[] uRLArray20 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader21 = java.net.URLClassLoader.newInstance(uRLArray20);
        uRLClassLoader21.clearAssertionStatus();
        java.net.URL[] uRLArray23 = uRLClassLoader21.getURLs();
        java.lang.ClassLoader classLoader24 = uRLClassLoader21.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader25 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray16, classLoader24);
        java.net.URL uRL27 = launchedURLClassLoader25.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream29 = launchedURLClassLoader25.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader30 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray10, (java.lang.ClassLoader) launchedURLClassLoader25);
        java.lang.ClassLoader classLoader31 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader32 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray10, classLoader31);
        java.net.URL[] uRLArray34 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader35 = java.net.URLClassLoader.newInstance(uRLArray34);
        uRLClassLoader35.clearAssertionStatus();
        java.net.URL[] uRLArray37 = uRLClassLoader35.getURLs();
        java.net.URL[] uRLArray38 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader39 = java.net.URLClassLoader.newInstance(uRLArray38);
        java.net.URL uRL41 = uRLClassLoader39.getResource("}");
        java.net.URL uRL43 = uRLClassLoader39.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader44 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray37, (java.lang.ClassLoader) uRLClassLoader39);
        java.net.URL[] uRLArray47 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader48 = java.net.URLClassLoader.newInstance(uRLArray47);
        java.lang.ClassLoader classLoader49 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader50 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray47, classLoader49);
        java.net.URL[] uRLArray51 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader52 = java.net.URLClassLoader.newInstance(uRLArray51);
        uRLClassLoader52.clearAssertionStatus();
        java.net.URL[] uRLArray54 = uRLClassLoader52.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader55 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray47, (java.lang.ClassLoader) uRLClassLoader52);
        java.util.Enumeration<java.net.URL> uRLEnumeration57 = launchedURLClassLoader55.findResources("Loader.Config.Name");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader58 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, (org.springframework.boot.loader.archive.Archive) jarFileArchive3, uRLArray37, (java.lang.ClassLoader) launchedURLClassLoader55);
        java.net.URL uRL60 = launchedURLClassLoader58.findResource("${");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLArray11);
        org.junit.Assert.assertNotNull(uRLClassLoader12);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(uRLArray16);
        org.junit.Assert.assertNotNull(uRLClassLoader17);
        org.junit.Assert.assertNotNull(uRLArray20);
        org.junit.Assert.assertNotNull(uRLClassLoader21);
        org.junit.Assert.assertNotNull(uRLArray23);
        org.junit.Assert.assertNotNull(classLoader24);
// flaky:         org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(uRLStream29);
        org.junit.Assert.assertNotNull(uRLArray34);
        org.junit.Assert.assertNotNull(uRLClassLoader35);
        org.junit.Assert.assertNotNull(uRLArray37);
        org.junit.Assert.assertNotNull(uRLArray38);
        org.junit.Assert.assertNotNull(uRLClassLoader39);
        org.junit.Assert.assertNull(uRL41);
// flaky:         org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNotNull(uRLArray47);
        org.junit.Assert.assertNotNull(uRLClassLoader48);
        org.junit.Assert.assertNotNull(uRLArray51);
        org.junit.Assert.assertNotNull(uRLClassLoader52);
        org.junit.Assert.assertNotNull(uRLArray54);
        org.junit.Assert.assertNotNull(uRLEnumeration57);
        org.junit.Assert.assertNull(uRL60);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        boolean boolean12 = jarFileArchive2.isExploded();
        java.lang.String str13 = jarFileArchive2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator14 = jarFileArchive2.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "jar archive" + "'", str13, "jar archive");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader4 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray1, classLoader3);
        java.util.Enumeration<java.net.URL> uRLEnumeration6 = launchedURLClassLoader4.findResources("loader.config.location");
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLEnumeration6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader4 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray1, classLoader3);
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        uRLClassLoader6.clearAssertionStatus();
        java.net.URL[] uRLArray8 = uRLClassLoader6.getURLs();
        java.lang.ClassLoader classLoader9 = uRLClassLoader6.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader10 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray1, classLoader9);
        java.net.URL uRL12 = launchedURLClassLoader10.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream14 = launchedURLClassLoader10.resources(":");
        launchedURLClassLoader10.clearCache();
        launchedURLClassLoader10.clearCache();
        launchedURLClassLoader10.clearCache();
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(classLoader9);
// flaky:         org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(uRLStream14);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.net.URL uRL3 = uRLClassLoader1.getResource("}");
        java.net.URL uRL5 = uRLClassLoader1.getResource("");
        uRLClassLoader1.clearAssertionStatus();
        boolean boolean7 = uRLClassLoader1.isRegisteredAsParallelCapable();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNull(uRL3);
// flaky:         org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile3 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive4 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile3);
        boolean boolean5 = jarFileArchive4.isExploded();
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        java.net.URL uRL10 = uRLClassLoader8.getResource("}");
        java.net.URL uRL12 = uRLClassLoader8.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader13 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive4, uRLArray6, (java.lang.ClassLoader) uRLClassLoader8);
        java.util.Enumeration<java.net.URL> uRLEnumeration15 = launchedURLClassLoader13.findResources("loader.home");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray1, (java.lang.ClassLoader) launchedURLClassLoader13);
        java.lang.ClassLoader classLoader17 = launchedURLClassLoader16.getParent();
        classLoader17.setPackageAssertionStatus("Loader.Home", false);
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNull(uRL10);
// flaky:         org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(uRLEnumeration15);
        org.junit.Assert.assertNotNull(classLoader17);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        java.lang.String str3 = jarFileArchive1.toString();
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter4 = null;
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive> archiveItor6 = jarFileArchive1.getNestedArchives(entryFilter4, entryFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jar archive" + "'", str3, "jar archive");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        org.springframework.boot.loader.jar.JarFile jarFile3 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive4 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile3);
        boolean boolean5 = jarFileArchive4.isExploded();
        java.net.URL[] uRLArray6 = new java.net.URL[] {};
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        java.net.URL uRL10 = uRLClassLoader8.getResource("}");
        java.net.URL uRL12 = uRLClassLoader8.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader13 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive4, uRLArray6, (java.lang.ClassLoader) uRLClassLoader8);
        java.util.Enumeration<java.net.URL> uRLEnumeration15 = launchedURLClassLoader13.findResources("loader.home");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray1, (java.lang.ClassLoader) launchedURLClassLoader13);
        java.lang.ClassLoader classLoader17 = launchedURLClassLoader16.getParent();
        java.util.Enumeration<java.net.URL> uRLEnumeration19 = launchedURLClassLoader16.getResources("App");
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRLArray6);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNull(uRL10);
// flaky:         org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(uRLEnumeration15);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(uRLEnumeration19);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "${" };
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner6 = new org.springframework.boot.loader.MainMethodRunner("jar archive", strArray5);
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner7 = new org.springframework.boot.loader.MainMethodRunner("", strArray5);
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner8 = new org.springframework.boot.loader.MainMethodRunner("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            mainMethodRunner8.run();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        uRLClassLoader6.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = new org.springframework.boot.loader.archive.ExplodedArchive(file0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.exists()\" because \"root\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.springframework.boot.loader.jar.JarFile jarFile0 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive1 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile0);
        boolean boolean2 = jarFileArchive1.isExploded();
        boolean boolean3 = jarFileArchive1.isExploded();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = jarFileArchive1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.iterator()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader4 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray1, classLoader3);
        java.io.InputStream inputStream6 = launchedURLClassLoader4.getResourceAsStream(":");
        launchedURLClassLoader4.setPackageAssertionStatus("", true);
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray12 = uRLClassLoader6.getURLs();
        java.net.URL[] uRLArray13 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader14 = java.net.URLClassLoader.newInstance(uRLArray13);
        java.lang.ClassLoader classLoader15 = uRLClassLoader14.getParent();
        java.lang.Module module16 = classLoader15.getUnnamedModule();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader17 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray12, classLoader15);
        boolean boolean18 = launchedURLClassLoader17.isRegisteredAsParallelCapable();
        launchedURLClassLoader17.clearAssertionStatus();
        java.net.URL uRL21 = launchedURLClassLoader17.getResource("App");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLArray13);
        org.junit.Assert.assertNotNull(uRLClassLoader14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(module16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        uRLClassLoader2.clearAssertionStatus();
        java.net.URL[] uRLArray4 = uRLClassLoader2.getURLs();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.String str12 = launchedURLClassLoader11.getName();
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.String[] strArray2 = new java.lang.String[] { "Loader.Config.Name" };
        org.springframework.boot.loader.MainMethodRunner mainMethodRunner3 = new org.springframework.boot.loader.MainMethodRunner("jar archive", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            mainMethodRunner3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: jar archive");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray4 = new java.net.URL[] {};
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.net.URL uRL8 = uRLClassLoader6.getResource("}");
        java.net.URL uRL10 = uRLClassLoader6.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.lang.Module module12 = launchedURLClassLoader11.getUnnamedModule();
        java.util.stream.Stream<java.net.URL> uRLStream14 = launchedURLClassLoader11.resources("}");
        launchedURLClassLoader11.clearCache();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNull(uRL8);
// flaky:         org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(module12);
        org.junit.Assert.assertNotNull(uRLStream14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.net.URL[] uRLArray1 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader2 = java.net.URLClassLoader.newInstance(uRLArray1);
        uRLClassLoader2.clearAssertionStatus();
        java.net.URL[] uRLArray4 = uRLClassLoader2.getURLs();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader6 = java.net.URLClassLoader.newInstance(uRLArray5);
        java.lang.ClassLoader classLoader7 = uRLClassLoader6.getParent();
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray4, (java.lang.ClassLoader) uRLClassLoader6);
        java.net.URL[] uRLArray10 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader11 = java.net.URLClassLoader.newInstance(uRLArray10);
        java.lang.ClassLoader classLoader12 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader13 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray10, classLoader12);
        java.net.URL[] uRLArray14 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader15 = java.net.URLClassLoader.newInstance(uRLArray14);
        uRLClassLoader15.clearAssertionStatus();
        java.net.URL[] uRLArray17 = uRLClassLoader15.getURLs();
        java.lang.ClassLoader classLoader18 = uRLClassLoader15.getParent();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray10, classLoader18);
        java.net.URL uRL21 = launchedURLClassLoader19.getResource("");
        java.util.stream.Stream<java.net.URL> uRLStream23 = launchedURLClassLoader19.resources(":");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader24 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray4, (java.lang.ClassLoader) launchedURLClassLoader19);
        boolean boolean25 = launchedURLClassLoader24.isRegisteredAsParallelCapable();
        java.util.Enumeration<java.net.URL> uRLEnumeration27 = launchedURLClassLoader24.findResources("${");
        java.util.stream.Stream<java.net.URL> uRLStream29 = launchedURLClassLoader24.resources("App");
        org.junit.Assert.assertNotNull(uRLArray1);
        org.junit.Assert.assertNotNull(uRLClassLoader2);
        org.junit.Assert.assertNotNull(uRLArray4);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLClassLoader6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLClassLoader11);
        org.junit.Assert.assertNotNull(uRLArray14);
        org.junit.Assert.assertNotNull(uRLClassLoader15);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(classLoader18);
// flaky:         org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(uRLStream23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(uRLEnumeration27);
        org.junit.Assert.assertNotNull(uRLStream29);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        boolean boolean4 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, classLoader10);
        java.net.URL[] uRLArray12 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader13 = java.net.URLClassLoader.newInstance(uRLArray12);
        uRLClassLoader13.clearAssertionStatus();
        java.net.URL[] uRLArray15 = uRLClassLoader13.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, (java.lang.ClassLoader) uRLClassLoader13);
        java.net.URLClassLoader uRLClassLoader17 = java.net.URLClassLoader.newInstance(uRLArray5, (java.lang.ClassLoader) launchedURLClassLoader16);
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray5, classLoader18);
        org.springframework.boot.loader.archive.Archive.EntryFilter entryFilter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.boot.loader.archive.Archive> archiveList21 = jarFileArchive2.getNestedArchives(entryFilter20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected call to getNestedArchives(filter)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLClassLoader13);
        org.junit.Assert.assertNotNull(uRLArray15);
        org.junit.Assert.assertNotNull(uRLClassLoader17);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader1 = java.net.URLClassLoader.newInstance(uRLArray0);
        java.lang.ClassLoader classLoader2 = java.lang.ClassLoader.getPlatformClassLoader();
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray0, classLoader2);
        org.springframework.boot.loader.jar.JarFile jarFile5 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive6 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile5);
        boolean boolean7 = jarFileArchive6.isExploded();
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URL[] uRLArray9 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader10 = java.net.URLClassLoader.newInstance(uRLArray9);
        java.net.URL uRL12 = uRLClassLoader10.getResource("}");
        java.net.URL uRL14 = uRLClassLoader10.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader15 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive6, uRLArray8, (java.lang.ClassLoader) uRLClassLoader10);
        java.net.URL[] uRLArray16 = uRLClassLoader10.getURLs();
        java.net.URL[] uRLArray17 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader18 = java.net.URLClassLoader.newInstance(uRLArray17);
        java.lang.ClassLoader classLoader19 = uRLClassLoader18.getParent();
        java.lang.Module module20 = classLoader19.getUnnamedModule();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader21 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray16, classLoader19);
        boolean boolean22 = launchedURLClassLoader21.isRegisteredAsParallelCapable();
        launchedURLClassLoader21.clearAssertionStatus();
        java.net.URLClassLoader uRLClassLoader24 = java.net.URLClassLoader.newInstance(uRLArray0, (java.lang.ClassLoader) launchedURLClassLoader21);
        launchedURLClassLoader21.setPackageAssertionStatus("Loader.Config.Name", false);
        java.lang.ClassLoader classLoader28 = launchedURLClassLoader21.getParent();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLClassLoader1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLArray9);
        org.junit.Assert.assertNotNull(uRLClassLoader10);
        org.junit.Assert.assertNull(uRL12);
// flaky:         org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(uRLArray16);
        org.junit.Assert.assertNotNull(uRLArray17);
        org.junit.Assert.assertNotNull(uRLClassLoader18);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(module20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(uRLClassLoader24);
        org.junit.Assert.assertNotNull(classLoader28);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.springframework.boot.loader.jar.JarFile jarFile1 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive2 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile1);
        boolean boolean3 = jarFileArchive2.isExploded();
        boolean boolean4 = jarFileArchive2.isExploded();
        java.net.URL[] uRLArray5 = new java.net.URL[] {};
        java.net.URL[] uRLArray8 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader9 = java.net.URLClassLoader.newInstance(uRLArray8);
        java.lang.ClassLoader classLoader10 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, classLoader10);
        java.net.URL[] uRLArray12 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader13 = java.net.URLClassLoader.newInstance(uRLArray12);
        uRLClassLoader13.clearAssertionStatus();
        java.net.URL[] uRLArray15 = uRLClassLoader13.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader16 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray8, (java.lang.ClassLoader) uRLClassLoader13);
        java.net.URLClassLoader uRLClassLoader17 = java.net.URLClassLoader.newInstance(uRLArray5, (java.lang.ClassLoader) launchedURLClassLoader16);
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader19 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive2, uRLArray5, classLoader18);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL20 = jarFileArchive2.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.boot.loader.jar.JarFile.getUrl()\" because \"this.jarFile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRLArray5);
        org.junit.Assert.assertNotNull(uRLArray8);
        org.junit.Assert.assertNotNull(uRLClassLoader9);
        org.junit.Assert.assertNotNull(uRLArray12);
        org.junit.Assert.assertNotNull(uRLClassLoader13);
        org.junit.Assert.assertNotNull(uRLArray15);
        org.junit.Assert.assertNotNull(uRLClassLoader17);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.net.URL[] uRLArray2 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader3 = java.net.URLClassLoader.newInstance(uRLArray2);
        java.lang.ClassLoader classLoader4 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader5 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray2, classLoader4);
        org.springframework.boot.loader.jar.JarFile jarFile7 = null;
        org.springframework.boot.loader.archive.JarFileArchive jarFileArchive8 = new org.springframework.boot.loader.archive.JarFileArchive(jarFile7);
        boolean boolean9 = jarFileArchive8.isExploded();
        java.net.URL[] uRLArray10 = new java.net.URL[] {};
        java.net.URL[] uRLArray11 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader12 = java.net.URLClassLoader.newInstance(uRLArray11);
        java.net.URL uRL14 = uRLClassLoader12.getResource("}");
        java.net.URL uRL16 = uRLClassLoader12.getResource("");
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader17 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, (org.springframework.boot.loader.archive.Archive) jarFileArchive8, uRLArray10, (java.lang.ClassLoader) uRLClassLoader12);
        java.net.URL[] uRLArray18 = uRLClassLoader12.getURLs();
        java.net.URL[] uRLArray19 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader20 = java.net.URLClassLoader.newInstance(uRLArray19);
        java.lang.ClassLoader classLoader21 = uRLClassLoader20.getParent();
        java.lang.Module module22 = classLoader21.getUnnamedModule();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader23 = new org.springframework.boot.loader.LaunchedURLClassLoader(uRLArray18, classLoader21);
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader24 = new org.springframework.boot.loader.LaunchedURLClassLoader(true, uRLArray2, classLoader21);
        org.junit.Assert.assertNotNull(uRLArray2);
        org.junit.Assert.assertNotNull(uRLClassLoader3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLArray11);
        org.junit.Assert.assertNotNull(uRLClassLoader12);
        org.junit.Assert.assertNull(uRL14);
// flaky:         org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(uRLArray18);
        org.junit.Assert.assertNotNull(uRLArray19);
        org.junit.Assert.assertNotNull(uRLClassLoader20);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(module22);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.net.URL[] uRLArray0 = new java.net.URL[] {};
        java.net.URL[] uRLArray3 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader4 = java.net.URLClassLoader.newInstance(uRLArray3);
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader6 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray3, classLoader5);
        java.net.URL[] uRLArray7 = new java.net.URL[] {};
        java.net.URLClassLoader uRLClassLoader8 = java.net.URLClassLoader.newInstance(uRLArray7);
        uRLClassLoader8.clearAssertionStatus();
        java.net.URL[] uRLArray10 = uRLClassLoader8.getURLs();
        org.springframework.boot.loader.LaunchedURLClassLoader launchedURLClassLoader11 = new org.springframework.boot.loader.LaunchedURLClassLoader(false, uRLArray3, (java.lang.ClassLoader) uRLClassLoader8);
        java.net.URLClassLoader uRLClassLoader12 = java.net.URLClassLoader.newInstance(uRLArray0, (java.lang.ClassLoader) launchedURLClassLoader11);
        uRLClassLoader12.close();
        java.net.URL uRL15 = uRLClassLoader12.getResource("loader.system");
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(uRLArray3);
        org.junit.Assert.assertNotNull(uRLClassLoader4);
        org.junit.Assert.assertNotNull(uRLArray7);
        org.junit.Assert.assertNotNull(uRLClassLoader8);
        org.junit.Assert.assertNotNull(uRLArray10);
        org.junit.Assert.assertNotNull(uRLClassLoader12);
        org.junit.Assert.assertNull(uRL15);
    }
}

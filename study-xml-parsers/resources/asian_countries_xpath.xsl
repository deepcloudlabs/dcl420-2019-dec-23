<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output media-type="application/xml" />
	<xsl:template match="/countries">
		<countries>
			<xsl:for-each
				select="country[number(population) > 150000000]">
				<xsl:sort select="population" data-type="number"
					order="descending" />

				<xsl:copy-of select="." />
			</xsl:for-each>
		</countries>
	</xsl:template>
</xsl:stylesheet>